package PaymentSystem;

public class Upi implements  PaymentMethod {
    @Override
    public boolean pay(Payment  payment) {
        System.out.println(payment.user.name+" is Paying amount" + payment.amount );
        return true;
    }
}
