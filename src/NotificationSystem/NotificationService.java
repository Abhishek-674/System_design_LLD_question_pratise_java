package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    List<Observer> observers;
    public NotificationService(){
        observers = new ArrayList<Observer>();
    }
    void addObserver(Observer observer){
        observers.add(observer);
    }
    void sendNotification(String message)
    {
        for(Observer observer:observers)
        {
//            System.out.println(message);
            observer.update(message);
        }
    }
}
