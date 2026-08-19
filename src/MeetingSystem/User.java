package MeetingSystem;

import java.util.UUID;

public class User {
    String name;
    String userID;
    public User(String name) {
        this.name = name;
        this.userID = UUID.randomUUID().toString();
    }
}
