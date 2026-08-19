package AtmMachine;

public interface AtmState {
    void insertCard(Atm atm,Card card);
    void validatePin(Atm atm,int pin);
    void performTransaction(Atm atm);
    void ejectCard(Atm atm);
}
