package ObjectOrientedDesign.ParkingLot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class Vehicle {
    private LocalDateTime timeArrived;
    private LocalDateTime timPaidUntil;
    private Optional<ArrayList<Ticket>> tickets;
    private String numberPlate;

    public Vehicle(LocalDateTime timeArrived, LocalDateTime timPaidUntil, Optional<ArrayList<Ticket>> tickets, String numberPlate) {
        this.timeArrived = timeArrived;
        this.timPaidUntil = timPaidUntil;
        this.tickets = tickets;
        this.numberPlate = numberPlate;
    }

    public LocalDateTime getTimeArrived() {
        return timeArrived;
    }

    public void setTimeArrived(LocalDateTime timeArrived) {
        this.timeArrived = timeArrived;
    }

    public LocalDateTime getTimPaidUntil() {
        return timPaidUntil;
    }

    public void setTimPaidUntil(LocalDateTime timPaidUntil) {
        this.timPaidUntil = timPaidUntil;
    }

    public Optional<ArrayList<Ticket>> getTickets() {
        return tickets;
    }

    public void setTicket(Optional<ArrayList<Ticket>> tickets) {
        this.tickets = tickets;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(timeArrived, vehicle.timeArrived) && Objects.equals(timPaidUntil, vehicle.timPaidUntil) && Objects.equals(tickets, vehicle.tickets) && Objects.equals(numberPlate, vehicle.numberPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeArrived, timPaidUntil, tickets, numberPlate);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "timeArrived=" + timeArrived +
                ", timPaidUntil=" + timPaidUntil +
                ", ticket=" + tickets +
                ", numberPlate='" + numberPlate + '\'' +
                '}';
    }
}
