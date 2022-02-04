package ObjectOrientedDesignTest;


import ObjectOrientedDesign.ParkingLot.Lot;
import ObjectOrientedDesign.ParkingLot.ParkingLotService;
import ObjectOrientedDesign.ParkingLot.Ticket;
import ObjectOrientedDesign.ParkingLot.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
                "AC1285HR"
        );
        Vehicle car3 = new Vehicle(LocalDateTime.of(2022,12,25,12,0),
                LocalDateTime.of(2022,12,25,14,0),
                new ArrayList<Ticket>(),
                "AD1285HR"
        );
        Vehicle car4 = new Vehicle(LocalDateTime.of(2022,12,25,12,0),
                LocalDateTime.of(2022,12,25,14,0),
                new ArrayList<Ticket>(),
                "AE1285HR"
        );

        // When
        underTest.addVehicle(car1);
        underTest.addVehicle(car2);
        underTest.addVehicle(car3);

        // Then
        assertThatThrownBy(() -> underTest.addVehicle(car4)).hasMessageContaining("No spaces left");
    }

    @Test
    void canRemoveCarIfInLot() {
        // Given
        Vehicle car = new Vehicle(LocalDateTime.of(2022,12,25,12,0),
                LocalDateTime.of(2022,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
        );

        // When
        underTest.addVehicle(car);
        underTest.removeVehicle(car);

        ArrayList<Vehicle> vehicles = underTest.getLot().getVehicles();
        int actual = vehicles.size();
        int expected = 0;

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void cannotRemoveCarIfNotInLot() {
        // Given
        Vehicle car = new Vehicle(LocalDateTime.of(2022,12,25,12,0),
                LocalDateTime.of(2022,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
        );

        // When

        // Then
        assertThatThrownBy(() -> underTest.removeVehicle(car)).hasMessageContaining("Vehicle not found");

    }

    @Test
    void canGiveTicketIfPastTime() {
        // Given
        Vehicle car = new Vehicle(LocalDateTime.of(1990,12,25,12,0),
                LocalDateTime.of(1990,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
        );

        // When
        underTest.addVehicle(car);
        underTest.checkTickets();
        ArrayList<Ticket> actualTickets = car.getTickets();
//        passes checking equality of the two ticket lists, but may not always have same time on tickets using .now for both
        ArrayList<Ticket> expectedTickets = new ArrayList<>(List.of(new Ticket(car.getNumberPlate(), LocalDateTime.now())));
//        so checking this way too
        String actual = actualTickets.get(0).getVehicleReg();
        String expected = expectedTickets.get(0).getVehicleReg();

        // Then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void doesNotGiveTicketIfWithinTime() {
        // Given
        Vehicle car = new Vehicle(LocalDateTime.of(1990,12,25,12,0),
                LocalDateTime.of(2090,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
        );

        // When
        underTest.addVehicle(car);
        underTest.checkTickets();

        ArrayList<Ticket> actual = car.getTickets();
        ArrayList<Ticket> expected = new ArrayList<>();

        // Then
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void canGiveSecondTicketIfCarAlreadyHasOne() {
        // Given
        Vehicle car = new Vehicle(LocalDateTime.of(1990,12,25,12,0),
                LocalDateTime.of(1990,12,25,14,0),
                new ArrayList<Ticket>(),
                "AB1285HR"
        );

        // When
        underTest.addVehicle(car);
        underTest.checkTickets();
        underTest.checkTickets();

        ArrayList<Ticket> actualTickets = car.getTickets();
        ArrayList<Ticket> expectedTickets = new ArrayList<>(List.of(
                new Ticket(car.getNumberPlate(), LocalDateTime.now()),
                new Ticket(car.getNumberPlate(), LocalDateTime.now())
                ));

        List<String> actual = actualTickets.stream().map(Ticket::getVehicleReg).collect(Collectors.toList());
        List<String> expected = expectedTickets.stream().map(Ticket::getVehicleReg).collect(Collectors.toList());

        // Then
        assertThat(actual).isEqualTo(expected);
    }
}
