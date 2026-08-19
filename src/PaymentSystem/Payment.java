package PaymentSystem;

public class Payment {
    User user;
    int amount;
    PaymentStatus paymentStatus;
    public Payment(User user, int amount) {
        this.user = user;
        this.amount = amount;
        paymentStatus = PaymentStatus.PENDING;

    }

}
