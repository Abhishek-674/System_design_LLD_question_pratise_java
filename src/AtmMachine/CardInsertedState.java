package AtmMachine;

public class CardInsertedState implements AtmState {
    @Override
    public void insertCard(Atm atm,Card card){

    }
    @Override
    public void validatePin(Atm atm,int pin){
        if(pin==atm.currentCard.pin)
        {
            System.out.println("PIN is validated");
            atm.setState(new TransactionState());

        }
        else {
            System.out.println("PIN is incorrect");
        }
    }
    @Override
    public void performTransaction(Atm atm){};
    @Override
    public void ejectCard(Atm atm){};
}
