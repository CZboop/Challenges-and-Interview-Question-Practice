package ObjectOrientedDesignTest;


import ObjectOrientedDesign.ParkingLot.Lot;
import ObjectOrientedDesign.ParkingLot.ParkingLotService;
import ObjectOrientedDesign.ParkingLot.Ticket;
import ObjectOrientedDesign.ParkingLot.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ParkingLotTests {
    private ParkingLotService underTest;

    @BeforeEach
    void setUp(){
        underTest = new ParkingLotService(new Lot(3, 0, new ArrayList<>()));
    }

    @Test
    void canAddCarWhenThereIsSpace() {
        // Given
        Vehicle car = new Vehicle(LocalDateTime.of(2022,12,25,12,0),
                LocalDateTime.of(2022,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
                );

        // When
        underTest.addVehicle(car);
        ArrayList<Vehicle> vehicles = underTest.getLot().getVehicles();
        boolean actual = vehicles.contains(car);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void cannotAddCarWhenThereIsNotSpace() {
        // Given
        Vehicle car1 = new Vehicle(LocalDateTime.of(2022,12,25,12,0),
                LocalDateTime.of(2022,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
        );
        Vehicle car2 = new Vehicle(LocalDateTime.of(2022,12,25,12,0),
                LocalDateTime.of(2022,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
        );
        Vehicle car3 = new Vehicle(LocalDateTime.of(2022,12,25,12,0),
                LocalDateTime.of(2022,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
        );
        Vehicle car4 = new Vehicle(LocalDateTime.of(2022,12,25,12,0),
                LocalDateTime.of(2022,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
        );


        // When


        // Then

    }

    @Test
    void canRemoveCarIfInLot() {
        // Given


        // When


        // Then

    }

    @Test
    void cannotRemoveCarIfNotInLot() {
        // Given


        // When


        // Then

    }

    @Test
    void canGiveTicketIfPastTime() {
        // Given


        // When


        // Then

    }

    @Test
    void doesNotGiveTicketIfWithinTime() {
        // Given


        // When


        // Then

    }

    @Test
    void canGiveSecondTicketIfCarAlreadyHasOne() {
        // Given


        // When


        // Then

    }
}
