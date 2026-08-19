package VendingMachine;

public class DispenseState extends  VendingState {
    @Override
    void insertCoin(VendingMachine vendingMachine,int amount) {
        System.out.println("Coin is already inserted");
    };
    @Override
    void selectItem(VendingMachine vendingMachine,Product product) {
         System.out.println("Item is already selected");
    };
    void dispense(VendingMachine vendingMachine){
        System.out.println("Please collect item ");
        vendingMachine.setState(new IdleState());
    };
    void exit(VendingMachine vendingMachine){
        vendingMachine.setState(new IdleState());
    };
    void cancle(VendingMachine vendingMachine){
        vendingMachine.setState(new IdleState());
    };
}
