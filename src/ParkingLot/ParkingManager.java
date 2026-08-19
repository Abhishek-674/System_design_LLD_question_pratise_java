package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    List<ParkingLevel> parkingLevels;
    List<Ticket> tickets;
    public ParkingManager(){
        parkingLevels = new ArrayList<ParkingLevel>();
        tickets = new ArrayList<Ticket>();
        for(int i = 0; i < 5; i++){
            parkingLevels.add(new ParkingLevel(i+1));
        }
    }
    Ticket parkVehicle(int level,Vehicle vehicle)
    {
        ParkingSpot spot = parkingLevels.get(level-1).getAvailableParkingSpot();
        if(spot == null)
        {
            System.out.println("Spot not available");
            return null;
        }
        else {
            spot.parkVehicle(vehicle);
            Ticket ticket = new Ticket(vehicle,spot);
            tickets.add(ticket);
            System.out.println(vehicle.vehicleType+" is "+vehicle.getNumber()+" is parked in level  "+spot.level+" and spot "+spot.id);
            return ticket;
        }


    }

    void unparkVehicle(Ticket ticket)
    {
        ticket.parkingSpot.unparkVehicle(ticket.vehicle);
        System.out.println(ticket.vehicle.number+" vehicle is unparked");
//        System.out.println(ticket.parkingSpot.id+ " id is "+ticket.parkingSpot.isfree);
        tickets.remove(ticket);
    }


}
