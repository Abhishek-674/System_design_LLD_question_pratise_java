package RentalStore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
    List<Vehicle> vehicles;
    public Store(String name) {
        this.name = name;
        this.vehicles=new ArrayList<Vehicle>();
    }
    void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
    void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }
    public Vehicle getAvailableVehicle(){
          for(Vehicle vehicle:vehicles){
              if(vehicle.isfree)
                  return vehicle;
          }
          return null;
    }
}
