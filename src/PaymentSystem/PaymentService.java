package PaymentSystem;

public class PaymentService {
    PaymentMethod paymentMethod;
    void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    void makePayment(Payment  payment)
    {
        System.out.println(payment.paymentStatus);
        if(paymentMethod.pay(payment))
        {
            payment.paymentStatus=PaymentStatus.SUCCESS;
            System.out.println(payment.paymentStatus);
        }
        else {
            payment.paymentStatus=PaymentStatus.FAILED;
            System.out.println(payment.paymentStatus);
        }
    }
}
