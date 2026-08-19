package VendingMachine;

public class Main {

    public static void main(String [] args)
    {
        VendingMachine vendingMachine = new VendingMachine();
        Product p1=new Product("COKE",50,50);
        Product p2=new Product("PEPSI",50,60);
        vendingMachine.insertCoin(50);
        vendingMachine.selectItem(p2);
        vendingMachine.dispense();
        vendingMachine.exit();
    }
}
