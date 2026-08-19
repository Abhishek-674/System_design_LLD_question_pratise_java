package NotificationSystem;


public abstract class  Observer {
    User user;
    public Observer(User user){
        this.user=user;
    }
    void update(String message){};
}
