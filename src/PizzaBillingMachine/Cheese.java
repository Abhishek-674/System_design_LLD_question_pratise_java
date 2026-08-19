package PizzaBillingMachine;

public class Cheese extends Decorator{
    public Cheese(PizzaBiling pizza) {
        super(pizza);
    }
    @Override
    public String getDiscription()
    {
       return pizza.getDiscription()+" Cheese";
    }
    @Override
    public int getCost()
    {
        System.out.println("Cost of Cheese "+"10");
        return pizza.getCost()+10;
    }
}
