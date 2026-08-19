package PizzaBillingMachine;

public class Main {
    public static void main(String[] args) {
        PizzaBiling b1=new B1();
        b1 = new Cheese(b1);
        b1=new Panner(b1);
        int total= b1.getCost();
        System.out.println("total cost is "+total);
        PizzaBiling b2=new B2();
//        b2 = new Cheese(b2);
        b2=new Panner(b2);
        int total2= b2.getCost();
        System.out.println("total cost is "+total2);
        System.out.println(b1.getDiscription());
        System.out.println(b2.getDiscription());

    }
}
