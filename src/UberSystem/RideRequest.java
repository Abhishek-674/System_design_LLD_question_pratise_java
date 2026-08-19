package UberSystem;



public class RideRequest {
    Location from;
    Location to;
    VehicleType vehicleType;
    public RideRequest(Location from, Location to, VehicleType vehicleType) {
        this.from = from;
        this.to = to;
        this.vehicleType = vehicleType;
    }



}
