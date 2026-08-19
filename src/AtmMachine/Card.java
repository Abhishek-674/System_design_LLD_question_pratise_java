package AtmMachine;

import java.util.UUID;

public class Card {
    User user;
    Account account;
    String cardNumber;
    int pin;
    public Card(User user, Account account) {
        this.user = user;
        this.account = account;
        this.cardNumber= UUID.randomUUID().toString();
        this.pin=1234;
    }
    void setPin(int pin) {
        this.pin = pin;
    }
    void withdrawCash(Double amount) {
        this.account.withdraw(amount);
    }

}
