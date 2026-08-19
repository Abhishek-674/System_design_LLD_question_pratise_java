package NotificationSystem;

public class Sms extends Observer{
    public Sms(User u){
        super(u);
    }
    @Override
    public void update(String message){
        System.out.println("Sms has been sent to "+this.user.name);
        System.out.println(message);
    }
}
