package ObjectOrientedDesign.CallCenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CallCenter {
    ArrayList<Worker> workers;
    ArrayList<Call> calls;

    public CallCenter(ArrayList<Worker> workers, ArrayList<Call> calls) {
        this.workers = workers;
        this.calls = calls;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public ArrayList<Call> getCalls() {
        return calls;
    }

    public void setCalls(ArrayList<Call> calls) {
        this.calls = calls;
    }

    public void dispatchCall(Call call){
        List<Worker> freeRespondents = workers.stream().filter(
                (x) -> x.getLevel() == Level.RESPONDENT
                        && x.getCurrentCall().isEmpty()).collect(Collectors.toList());
        List<Worker> freeManagers = workers.stream().filter(
                (x) -> x.getLevel() == Level.MANAGER
                        && x.getCurrentCall().isEmpty()).collect(Collectors.toList());
        List<Worker> freeDirectors = workers.stream().filter(
                (x) -> x.getLevel() == Level.DIRECTOR
                        && x.getCurrentCall().isEmpty()).collect(Collectors.toList());
        if (freeRespondents.size() > 0){
            freeRespondents.get(0).setCurrentCall(Optional.of(call));
        } else if (freeManagers.size() > 0){
            freeManagers.get(0).setCurrentCall(Optional.of(call));
        } else if (freeDirectors.size() > 0){
            freeDirectors.get(0).setCurrentCall(Optional.of(call));
        } else {
            throw new IllegalStateException("No one is available to take calls");
        }
    }

    public Optional<Worker> getWorkerHandlingCall(Long callId){
        for (Worker worker : workers){
            Optional<Call> call = worker.getCurrentCall();
            if (call.isPresent() && call.get().getId() == callId){
                return Optional.of(worker);
            }
        }
        return Optional.empty();
    }

    public void escalateCall(Call call){
        Optional<Worker> worker = getWorkerHandlingCall(call.getId());
        if (worker.isEmpty()){
            dispatchCall(call);
        } else {
            Worker workerValue = worker.get();
            Level workerLevel = workerValue.getLevel();
            if (workerLevel.name().equals("DIRECTOR")){
                throw new IllegalStateException("Unable to escalate");
            } else if (workerLevel.name().equals("MANAGER")){
                List<Worker> freeDirectors = workers.stream().filter(
                        (x) -> x.getLevel() == Level.DIRECTOR
                                && x.getCurrentCall().isEmpty()).collect(Collectors.toList());
                if (freeDirectors.size() > 0) {
                    workerValue.setCurrentCall(Optional.empty());
                    freeDirectors.get(0).setCurrentCall(Optional.of(call));
                } else {
                    throw new IllegalStateException("Unable to escalate");
                }
            } else {
                List<Worker> freeManagers = workers.stream().filter(
                        (x) -> x.getLevel() == Level.MANAGER
                                && x.getCurrentCall().isEmpty()).collect(Collectors.toList());
                if (freeManagers.size() > 0) {
                    workerValue.setCurrentCall(Optional.empty());
                    freeManagers.get(0).setCurrentCall(Optional.of(call));
                } else {
                    List<Worker> freeDirectors = workers.stream().filter(
                            (x) -> x.getLevel() == Level.DIRECTOR
                                    && x.getCurrentCall().isEmpty()).collect(Collectors.toList());
                    if (freeDirectors.size() > 0) {
                        workerValue.setCurrentCall(Optional.empty());
                        freeDirectors.get(0).setCurrentCall(Optional.of(call));
                    } else {
                        throw new IllegalStateException("Unable to escalate");
                    }
                }
            }
        }
    }

    public void addCall(Call call){
        if (calls.contains(call)){
            throw new IllegalStateException("Cannot add the same call more than once");
        } else {
            calls.add(call);
        }
    }

    public void resolveCall(Call call){
        call.setResolved(true);
        Optional<Worker> worker = getWorkerHandlingCall(call.getId());
        if (worker.isPresent()){
            worker.get().setCurrentCall(Optional.empty());
        }
    }

    public void addWorker(Worker worker){
        if (workers.contains(worker)){
            throw new IllegalStateException("Cannot add the same worker more than once");
        } else {
            workers.add(worker);
        }
    }
}
