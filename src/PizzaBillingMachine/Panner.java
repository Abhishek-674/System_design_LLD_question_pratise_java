package PizzaBillingMachine;

public class Panner extends Decorator{
    public Panner(PizzaBiling pizza){
       super(pizza);
    }
    @Override
    public String getDiscription()
    {
     return (pizza.getDiscription()+" Panner");
    }
    @Override
    public int getCost()
    {
        System.out.println("Cost of panner is 20");
        return pizza.getCost()+20;
    }
}
