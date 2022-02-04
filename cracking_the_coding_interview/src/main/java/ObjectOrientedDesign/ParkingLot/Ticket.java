package ObjectOrientedDesign.ParkingLot;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
    private String vehicleReg;
    private LocalDateTime timeServed;

    public Ticket(String vehicleReg, LocalDateTime timeServed) {
        this.vehicleReg = vehicleReg;
        this.timeServed = timeServed;
    }

    public String getVehicleReg() {
        return vehicleReg;
    }

    public void setVehicleReg(String vehicleReg) {
        this.vehicleReg = vehicleReg;
    }

    public LocalDateTime getTimeServed() {
        return timeServed;
    }

    public void setTimeServed(LocalDateTime timeServed) {
        this.timeServed = timeServed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(vehicleReg, ticket.vehicleReg) && Objects.equals(timeServed, ticket.timeServed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleReg, timeServed);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "vehicleReg='" + vehicleReg + '\'' +
                ", timeServed=" + timeServed +
                '}';
    }
}
