package AtmMachine;

public class IdleState implements AtmState {
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
    public void ejectCard(Atm atm){};
}
