package PizzaBillingMachine;

public class B2 implements PizzaBiling {
    int price=50;
//    public B2(int price) {
//        this.price = price;
//    }
    void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String getDiscription() {
       return "Base b2";

    }
    @Override
    public int getCost() {
        System.out.println("Cost of B2 is "+price);
        return price;
    }
}
