package PaymentSystem;

public class Netbanking implements PaymentMethod {
    @Override
    public boolean pay(Payment payment) {
        System.out.println(payment.user.name+" is Paying by Netbanking "+payment.amount);
        return true;
    }
}
