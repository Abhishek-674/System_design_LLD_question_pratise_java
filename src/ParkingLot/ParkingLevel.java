package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {
    List<ParkingSpot> parkingSpots;
    int levelNumber;
    public ParkingLevel(int levelNumber) {
        this.levelNumber = levelNumber;
        parkingSpots = new ArrayList<ParkingSpot>();
        for(int i = 0; i < 10; i++){
            parkingSpots.add(new ParkingSpot(i,levelNumber));
        }
    }
    void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }
    public ParkingSpot getAvailableParkingSpot()
    {
//        System.out.println("Inside parking level class  ");
        for(ParkingSpot parkingSpot : parkingSpots)
        {
            if(parkingSpot.isfree==false)
                {
                return parkingSpot;
                }
        }
        return null;
    }

}
