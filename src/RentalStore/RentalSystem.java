package RentalStore;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    BookingManager bookingManager;
    List<Store> stores;
    public RentalSystem(){
        bookingManager = new BookingManager();
        stores = new ArrayList<Store>();
    }

    Store getStore(String name){
        for(Store store : stores){
            if(store.name.equals(name)){
                return store;
            }
        }
        return null;
    }
    void addStore(Store store){
        stores.add(store);
    }
    Vehicle getAvailableVehicleFromStore(Store store){
        for(Vehicle vehicle:store.vehicles)
        {
            if(vehicle.isfree)
                return vehicle;
        }
        return null;
    }


}
