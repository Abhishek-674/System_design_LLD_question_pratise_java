package RentalStore;

import RentalStore.Vehicle;

import java.util.Date;
import java.util.UUID;

    class Bookings {
    String id;
    User user;
    Vehicle  vehicle;
    Date startDate;
    Date endDate;
    String storeName;
    public Bookings(Builder builder)
    {
        this.id= UUID.randomUUID().toString();
        this.user = builder.user;
        this.vehicle = builder.vehicle;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.storeName = builder.storeName;

    }
    static class Builder{
        User user;
        Vehicle  vehicle;
        Date startDate;
        Date endDate;
        String storeName;

        Builder setUser(User user){
            this.user = user;
            return this;
        }
        Builder setVehicle(Vehicle vehicle){
            this.vehicle = vehicle;
            return this;
        }
        Builder setStartDate(Date startDate){
            this.startDate = startDate;
            return this;
        }
        Builder setEndDate(Date endDate){
            this.endDate = endDate;
            return this;
        }
        Builder setStoreName(String storeName){
            this.storeName = storeName;
            return this;
        }
        Bookings build(){
            return  new Bookings(this);
        }
    }
}
