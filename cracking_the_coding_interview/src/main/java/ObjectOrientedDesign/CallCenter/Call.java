package ObjectOrientedDesign.CallCenter;

import java.util.Objects;

public class Call {
    private Long id;
    private String callerNumber;
    private boolean isResolved;

    public Call(Long id, String callerNumber, boolean isResolved) {
        this.id = id;
        this.callerNumber = callerNumber;
        this.isResolved = isResolved;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCallerNumber() {
        return callerNumber;
    }

    public void setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Call call = (Call) o;
        return isResolved == call.isResolved && Objects.equals(id, call.id) && Objects.equals(callerNumber, call.callerNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, callerNumber, isResolved);
    }

    @Override
    public String toString() {
        return "Call{" +
                "id=" + id +
                ", callerNumber='" + callerNumber + '\'' +
                ", isResolved=" + isResolved +
                '}';
    }
}
