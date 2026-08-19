package NotificationSystem;

public class Main {
    public static void main(String[] args)
    {
        NotificationService notificationService = new NotificationService();
        User u1=new User("Abhishek");
        User u2=new User("Aditya");
        User u3=new User("rISHI");
        User u4=new User("Maitrye");
        User u5=new User("bitu");
        User u6=new User("aman");
        Observer o1=new Email(u1);
        Observer o2=new Email(u2);
        Observer o3=new Email(u3);
        Observer o4=new Email(u4);
        Observer o5=new Sms(u5);
        Observer o6=new Sms(u6);
        notificationService.addObserver(o1);
        notificationService.addObserver(o2);
        notificationService.addObserver(o3);
        notificationService.addObserver(o4);
        notificationService.addObserver(o5);
        notificationService.addObserver(o6);
        notificationService.sendNotification("this is msg for you updation ragarding email privacy");



    }
}
