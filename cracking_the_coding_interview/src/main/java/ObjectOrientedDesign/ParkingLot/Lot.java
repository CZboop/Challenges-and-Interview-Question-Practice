package ObjectOrientedDesign.ParkingLot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Lot {
    private int capacity;
    private int occupiedSpaces;
    private ArrayList<Vehicle> vehicles;

    public Lot(int capacity, int occupiedSpaces, ArrayList<Vehicle> vehicles) {
        this.capacity = capacity;
        this.occupiedSpaces = occupiedSpaces;
        this.vehicles = vehicles;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOccupiedSpaces() {
        return occupiedSpaces;
    }

    public void setOccupiedSpaces(int occupiedSpaces) {
        this.occupiedSpaces = occupiedSpaces;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lot lot = (Lot) o;
        return capacity == lot.capacity && occupiedSpaces == lot.occupiedSpaces && Objects.equals(vehicles, lot.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, occupiedSpaces, vehicles);
    }

    @Override
    public String toString() {
        return "Lot{" +
                "capacity=" + capacity +
                ", occupiedSpaces=" + occupiedSpaces +
                ", vehicles=" + vehicles +
                '}';
    }
}
