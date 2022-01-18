package ObjectOrientedDesign.CallCenter;

import java.util.Objects;
import java.util.Optional;

public class Worker {
    private int id;
    private String name;
    private Level level;
    private Optional<Call> currentCall;

    public Worker(int id, String name, Level level, Optional<Call> currentCall) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.currentCall = currentCall;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Optional<Call> getCurrentCall() {
        return currentCall;
    }

    public void setCurrentCall(Optional<Call> currentCall) {
        this.currentCall = currentCall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id == worker.id && Objects.equals(name, worker.name) && level == worker.level && Objects.equals(currentCall, worker.currentCall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, currentCall);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", currentCall=" + currentCall +
                '}';
    }
}
