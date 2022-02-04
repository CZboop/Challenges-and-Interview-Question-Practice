package ObjectOrientedDesign.ParkingLot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLotService {
    private Lot lot;

    public ParkingLotService(Lot lot) {
        this.lot = lot;
    }

    public Lot getLot() {
        return lot;
    }

    public void addVehicle(Vehicle vehicle){
        if (lot.getCapacity() > lot.getOccupiedSpaces() ){
            lot.setOccupiedSpaces(lot.getOccupiedSpaces() + 1);
            ArrayList<Vehicle> newVehicles = lot.getVehicles();
            newVehicles.add(vehicle);
            lot.setVehicles(newVehicles);
        }
        else {
            throw new IllegalStateException("No spaces left");
        }
    }

    public void removeVehicle(Vehicle vehicle){
        if (lot.getVehicles().contains(vehicle)){
            ArrayList<Vehicle> vehicles = lot.getVehicles();
            vehicles.remove(vehicle);
            lot.setVehicles(vehicles);
        }
        else{
            throw new IllegalStateException("Vehicle not found");
        }
    }

    public void checkTickets(){
        for (Vehicle vehicle : lot.getVehicles()){
            if (!ticketIsValid(vehicle)){
                Ticket ticket = new Ticket(vehicle.getNumberPlate(), LocalDateTime.now());
                if (vehicle.getTickets().isEmpty()){
                    vehicle.setTicket(new ArrayList<>(List.of(ticket)));
                }
                else {
                    ArrayList<Ticket> tickets = vehicle.getTickets();
                    tickets.add(ticket);
                    vehicle.setTicket(tickets);
                }
            }
        }
    }

    public boolean ticketIsValid(Vehicle vehicle){
        if (LocalDateTime.now().isAfter(vehicle.getTimePaidUntil())){
            return false;
        }
        else {
            return true;
        }
//        could handle equals differently or have a short grace period
    }
}
