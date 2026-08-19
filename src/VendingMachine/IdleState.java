package VendingMachine;

public class IdleState extends VendingState{
    @Override
    void insertCoin(VendingMachine vendingMachine,int amount) {
        System.out.println("Coin is inserted Please select item");
        vendingMachine.setState(new CoinInsertedState(amount));
    };
    @Override
    void selectItem(VendingMachine vendingMachine,Product product) {
        System.out.println("Please insert coin");
    };
    @Override
    void dispense(VendingMachine vendingMachine){
        System.out.println("Please insert coin");
    };
    @Override
    void exit(VendingMachine vendingMachine){

    };
    @Override
    void cancle(VendingMachine vendingMachine){};
}
