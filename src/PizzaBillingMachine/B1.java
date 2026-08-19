package PizzaBillingMachine;

public class B1 implements PizzaBiling {
    int price=100;
//    public B1(int price) {
//        this.price = price;
//    }
    void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String getDiscription() {
       return "Base b1";
    }

    @Override
    public int getCost() {
        System.out.println("Cost of B1 is"+ price);
        return price;
    }
}
