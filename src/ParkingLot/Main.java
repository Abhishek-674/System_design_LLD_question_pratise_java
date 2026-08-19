package ParkingLot;

public class Main {
    public static void main(String[] args) {
        ParkingManager  parkingManager = new ParkingManager();
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle c1=carFactory.create("abhi123",VehicleType.CAR);
        Vehicle c2=carFactory.create("abhi124",VehicleType.CAR);
        Vehicle c3=carFactory.create("abhi125",VehicleType.CAR);
        Vehicle b1=bikeFactory.create("adi123",VehicleType.BIKE);
        Vehicle b2=bikeFactory.create("adi125",VehicleType.BIKE);

        Ticket t1=parkingManager.parkVehicle(1,c1);
        Ticket t2=parkingManager.parkVehicle(1,c2);
        Ticket t3=parkingManager.parkVehicle(3,b1);
        parkingManager.unparkVehicle(t1);
        Ticket t4=parkingManager.parkVehicle(1,b2);
        parkingManager.unparkVehicle(t3);

    }
}
