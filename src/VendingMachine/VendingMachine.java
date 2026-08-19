package VendingMachine;

public class VendingMachine {
    VendingState currentState;
    public VendingMachine(){
        this.currentState=new IdleState();
    }
    void setState(VendingState vendingState) {
        this.currentState = vendingState;
    }
    void insertCoin(int amount) {
       currentState.insertCoin(this,amount);
    };
    void selectItem(Product product) {
        currentState.selectItem(this,product);
    };
    void dispense(){
        currentState.dispense(this);

    };
    void exit(){
       currentState.exit(this);
    };
    void cancle(){
       currentState.cancle(this);
    };
}
