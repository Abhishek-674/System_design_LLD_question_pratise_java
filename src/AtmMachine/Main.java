package AtmMachine;

public class Main {
    public static void main(String[] args) {
        Atm atm=new Atm();
        User u1=new User("Abhishek");
        User u2=new User("Khan");
        Account a1=new Account(u1);
        Account a2=new Account(u2);
        Card c1=new Card(u1,a1);
        Card c2=new Card(u2,a2);
        atm.setState(new IdleState());
        atm.setAtmCard(c1);
        atm.insertCard();
        atm.validatePin();
        atm.performTransaction();
        atm.performTransaction();
        atm.ejectCard();

    }
}
