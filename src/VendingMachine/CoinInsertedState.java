package VendingMachine;

public class CoinInsertedState extends  VendingState{
    int amount;
    public CoinInsertedState(int amount){
        this.amount = amount;
    }
    @Override
    void insertCoin(VendingMachine vendingMachine,int amount) {
       System.out.println("Coin is already inserted");
    };
    @Override
    void selectItem(VendingMachine vendingMachine,Product product) {
         if(amount<product.getPrice()){
             System.out.println("Amount to insert is less than price");
         }
         else{
             System.out.println("Product "+product.getName()+" is Selected. Please dispense item");
             vendingMachine.setState(new DispenseState());
         }

    };
    void dispense(VendingMachine vendingMachine){};
    void exit(VendingMachine vendingMachine){};
    void cancle(VendingMachine vendingMachine){};
}
