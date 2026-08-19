package ParkingLot;

import java.util.UUID;

public class Ticket {
    String id;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    public Ticket( Vehicle vehicle, ParkingSpot parkingSpot) {
        this.id = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    String getTicketId()
    {
        return id;
    }
}
