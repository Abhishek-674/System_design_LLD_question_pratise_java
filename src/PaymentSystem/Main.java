package PaymentSystem;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentMethod(new Upi());
        User u1=new User("Abhishek");
        User u2=new User("Aditya");
        Payment payment=new Payment(u1,5000);
        paymentService.makePayment(payment);
    }
}
