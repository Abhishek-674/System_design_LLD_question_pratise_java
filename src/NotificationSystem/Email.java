package NotificationSystem;



public class Email extends Observer{
    public Email(User u)
    {
        super(u);
    }
    @Override
    public void update(String message){
        System.out.println("Email has been sent to "+this.user.name);
        System.out.println(message);
    }
}
