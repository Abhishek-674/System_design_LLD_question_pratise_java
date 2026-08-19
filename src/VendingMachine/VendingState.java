package VendingMachine;

public abstract class VendingState {
       void insertCoin(VendingMachine vendingMachine,int amount) {};
       void selectItem(VendingMachine vendingMachine,Product product) {};
       void dispense(VendingMachine vendingMachine){};
       void exit(VendingMachine vendingMachine){};
       void cancle(VendingMachine vendingMachine){};
}
