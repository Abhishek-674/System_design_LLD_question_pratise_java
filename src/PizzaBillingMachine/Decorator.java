package PizzaBillingMachine;

public abstract class Decorator implements PizzaBiling {
    PizzaBiling pizza;
    public Decorator(PizzaBiling pizza) {
        this.pizza = pizza;
    }


}
