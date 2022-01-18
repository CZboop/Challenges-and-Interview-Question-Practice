package ObjectOrientedDesignTest;

import ObjectOrientedDesign.CallCenter.Call;
import ObjectOrientedDesign.CallCenter.CallCenter;
import ObjectOrientedDesign.CallCenter.Level;
import ObjectOrientedDesign.CallCenter.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CallCenterTest {
    private CallCenter underTest;

    @BeforeEach
    void setUp(){
        ArrayList<Worker> workers = new ArrayList<Worker>(List.of(
                new Worker(1, "Worker#1", Level.RESPONDENT, Optional.empty()),
                new Worker(2, "Worker#2", Level.RESPONDENT, Optional.empty()),
                new Worker(3, "Worker#3", Level.RESPONDENT, Optional.empty()),
                new Worker(4, "Worker#4", Level.MANAGER, Optional.empty()),
                new Worker(5, "Worker#5", Level.MANAGER, Optional.empty()),
                new Worker(6, "Worker#6", Level.DIRECTOR, Optional.empty())
                ));
        underTest = new CallCenter(workers, new ArrayList<Call>());
    }

    @Test
    void canAddCallWhenWorkersFree() {
        // Given
        Call call =  new Call(1L, "12345678911", false);

        // When
        underTest.addCall(call);
        int actual = underTest.getCalls().size();
        int expected = 1;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void throwsExceptionWhenAddSameCallTwice() {
        // Given
        Call call1 =  new Call(1L, "12345678211", false);
        Call call2 =  new Call(2L, "12345678211", false);

        // When
        underTest.addCall(call1);
        underTest.addCall(call2);

        // Then
        assertThatThrownBy(() -> underTest.addCall(call2)).hasMessageContaining("Cannot add the same call more than once");
    }

    @Test
    void canDispatchCallToRespondentWhenFree() {
        // Given
        Call call =  new Call(1L, "12345678911", false);

        // When
        underTest.addCall(call);
        underTest.dispatchCall(call);

        ArrayList<Worker> workers = underTest.getWorkers();
        Worker activeWorker = null;
        for (Worker worker : workers){
            if (worker.getCurrentCall().isPresent()){
                if (worker.getCurrentCall().get().getId() == call.getId()){
                    activeWorker = worker;
                }
            }
        }
        Level actual = activeWorker.getLevel();
        Level expected = Level.RESPONDENT;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetWorkerReturnsOneWorker() {
        // Given
        Call call =  new Call(1L, "12345678911", false);

        // When
        underTest.addCall(call);
        underTest.dispatchCall(call);

        Optional<Worker> actual = underTest.getWorkerHandlingCall(call.getId());

        // Then
        assertThat(actual).isPresent();
    }

    @Test
    void canGetWorkerReturnsRightLevel() {
        // Given
        Call call =  new Call(1L, "12345678911", false);
        underTest.addCall(call);
        underTest.dispatchCall(call);

        // When
        Optional<Worker> assignedWorker = underTest.getWorkerHandlingCall(call.getId());
        Level actual = assignedWorker.get().getLevel();

        Level expected = Level.RESPONDENT;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetWorkerReturnsWorkerWithCurrentCallWithMatchingId() {
        // Given
        Call call =  new Call(8L, "12345678911", false);
        underTest.addCall(call);
        underTest.dispatchCall(call);

        // When
        Optional<Worker> assignedWorker = underTest.getWorkerHandlingCall(call.getId());
        Long actual = assignedWorker.get().getCurrentCall().get().getId();

        Long expected = 8L;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canAssignToManagerIfNoRespondentsFree() {
        // Given
        Call call1 =  new Call(1L, "12345678911", false);
        underTest.addCall(call1);
        underTest.dispatchCall(call1);
        Call call2 =  new Call(2L, "12345678911", false);
        underTest.addCall(call2);
        underTest.dispatchCall(call2);
        Call call3 =  new Call(3L, "12345678911", false);
        underTest.addCall(call3);
        underTest.dispatchCall(call3);
        Call call4 =  new Call(4L, "12345678911", false);
        underTest.addCall(call4);
        underTest.dispatchCall(call4);

        // When
        Optional<Worker> assignedWorker = underTest.getWorkerHandlingCall(4L);
        Level actual = assignedWorker.get().getLevel();

        Level expected = Level.MANAGER;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canAssignToDirectorIfNoRespondentsOrManagersFree() {
        // Given
        Call call1 =  new Call(1L, "12345678911", false);
        underTest.addCall(call1);
        underTest.dispatchCall(call1);
        Call call2 =  new Call(2L, "12345678911", false);
        underTest.addCall(call2);
        underTest.dispatchCall(call2);
        Call call3 =  new Call(3L, "12345678911", false);
        underTest.addCall(call3);
        underTest.dispatchCall(call3);
        Call call4 =  new Call(4L, "12345678911", false);
        underTest.addCall(call4);
        underTest.dispatchCall(call4);
        Call call5 =  new Call(5L, "12345678911", false);
        underTest.addCall(call5);
        underTest.dispatchCall(call5);
        Call call6 =  new Call(6L, "12345678911", false);
        underTest.addCall(call6);
        underTest.dispatchCall(call6);

        // When
        Optional<Worker> assignedWorker = underTest.getWorkerHandlingCall(6L);
        Level actual = assignedWorker.get().getLevel();

        Level expected = Level.DIRECTOR;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void throwsExceptionIfNoFreeWorkers() {
        // Given
        Call call1 =  new Call(1L, "12345678911", false);
        underTest.addCall(call1);
        underTest.dispatchCall(call1);
        Call call2 =  new Call(2L, "12345678911", false);
        underTest.addCall(call2);
        underTest.dispatchCall(call2);
        Call call3 =  new Call(3L, "12345678911", false);
        underTest.addCall(call3);
        underTest.dispatchCall(call3);
        Call call4 =  new Call(4L, "12345678911", false);
        underTest.addCall(call4);
        underTest.dispatchCall(call4);
        Call call5 =  new Call(5L, "12345678911", false);
        underTest.addCall(call5);
        underTest.dispatchCall(call5);
        Call call6 =  new Call(6L, "12345678911", false);
        underTest.addCall(call6);
        underTest.dispatchCall(call6);

        // When
        Call call7 =  new Call(7L, "12345678911", false);
        underTest.addCall(call7);

        // Then
        assertThatThrownBy(() -> underTest.dispatchCall(call7)).hasMessageContaining("No one is available to take calls");
    }

    @Test
    void canMarkCallAsResolved() {
        // Given
        Call call1 =  new Call(1L, "12345678211", false);
        underTest.addCall(call1);

        // When
        underTest.resolveCall(call1);
        boolean actual = call1.isResolved();
        boolean expected = true;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void markingCallAsResolvedSetsWorkerCallToNull() {
        // Given
        Call call1 =  new Call(1L, "12345678211", false);
        underTest.addCall(call1);
        underTest.dispatchCall(call1);
        Worker worker = underTest.getWorkerHandlingCall(1L).get();

        // When
        underTest.resolveCall(call1);
        Optional<Call> actual = worker.getCurrentCall();
        Optional<Call> expected = Optional.empty();

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canEscalateCallFromRespondentToManager() {
        // Given
        Call call1 =  new Call(1L, "12345678211", false);
        underTest.addCall(call1);
        underTest.dispatchCall(call1);
        underTest.escalateCall(call1);

        // When
        Level actual = underTest.getWorkerHandlingCall(call1.getId()).get().getLevel();
        Level expected = Level.MANAGER;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canEscalateCallToDirector() {
        // Given
        Call call1 =  new Call(1L, "12345678211", false);
        underTest.addCall(call1);
        underTest.dispatchCall(call1);
        underTest.escalateCall(call1);
        underTest.escalateCall(call1);

        // When
        Level actual = underTest.getWorkerHandlingCall(call1.getId()).get().getLevel();
        Level expected = Level.DIRECTOR;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

}
