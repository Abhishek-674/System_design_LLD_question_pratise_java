package AtmMachine;

import java.util.UUID;

public class Account {
    User user;
    String accountNumber;
    Double amount;
    public Account(User user) {
        this.user = user;
        this.amount=5000.0;
        this.accountNumber= UUID.randomUUID().toString();
        user.account=this;
    }
    void  deposit(Double amount) {
        this.amount=this.amount+amount;
    }
    void  withdraw(Double amount) {
        this.amount=this.amount-amount;
    }
    Double checkBalance() {
        return amount;
    }

}
