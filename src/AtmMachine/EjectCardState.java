package AtmMachine;

public class EjectCardState implements AtmState {
    @Override
    public void insertCard(Atm atm,Card card){
        System.out.println("Welcome!"+card.user.name+ " Your card is Inserted. Please enter the Pin");
        atm.setState(new CardInsertedState());
        atm.setAtmCard(card);
    }
    @Override
    public void validatePin(Atm atm, int pin){

    }
    @Override
    public void performTransaction(Atm atm){}
    @Override
    public void ejectCard(Atm atm){
        System.out.println("Please remove the card . Thank you!");
        atm.setState(new IdleState());
        atm.setAtmCard(null);
    };
}
