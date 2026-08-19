package ParkingLot;

public class ParkingSpot {
    int id;
    int level;
    boolean isfree;
    Vehicle vehicle;
    public ParkingSpot(int id, int level){
        this.id = id;
        this.level = level;
        this.isfree = false;
        vehicle=null;
    }
    public void parkVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        isfree=true;
    }
    public void unparkVehicle(Vehicle vehicle){
        this.vehicle=null;
        isfree=false;
    }
    public Vehicle  getVehicle()
    {
        return vehicle;
    }
}
