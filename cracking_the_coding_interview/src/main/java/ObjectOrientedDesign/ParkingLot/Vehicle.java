package ObjectOrientedDesign.ParkingLot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class Vehicle {
    private LocalDateTime timeArrived;
    private LocalDateTime timePaidUntil;
    private ArrayList<Ticket> tickets;
    private String numberPlate;

    public Vehicle(LocalDateTime timeArrived, LocalDateTime timePaidUntil, ArrayList<Ticket> tickets, String numberPlate) {
        this.timeArrived = timeArrived;
        this.timePaidUntil = timePaidUntil;
        this.tickets = tickets;
        this.numberPlate = numberPlate;
    }

    public LocalDateTime getTimeArrived() {
        return timeArrived;
    }

    public void setTimeArrived(LocalDateTime timeArrived) {
        this.timeArrived = timeArrived;
    }

    public LocalDateTime getTimePaidUntil() {
        return timePaidUntil;
    }

    public void setTimPaidUntil(LocalDateTime timePaidUntil) {
        this.timePaidUntil = timePaidUntil;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTicket(ArrayList<Ticket> tickets) {
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
        return Objects.equals(timeArrived, vehicle.timeArrived) && Objects.equals(timePaidUntil, vehicle.timePaidUntil) && Objects.equals(tickets, vehicle.tickets) && Objects.equals(numberPlate, vehicle.numberPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeArrived, timePaidUntil, tickets, numberPlate);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "timeArrived=" + timeArrived +
                ", timPaidUntil=" + timePaidUntil +
                ", ticket=" + tickets +
                ", numberPlate='" + numberPlate + '\'' +
                '}';
    }
}
