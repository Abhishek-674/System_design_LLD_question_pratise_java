package MeetingSystem;

public class Participants {
    User user;
    boolean vedio;
    boolean audio;
    public Participants(User user) {
        this.user = user;
        this.vedio = false;
        this.audio = false;
    }
    void turnOnVedio()
    {
        this.vedio = true;
    }
    void turnOffVedio()
    {
        this.vedio = false;
    }
    void turnOnAudio()
    {
        this.audio = true;
    }
    void turnOffAudio()
    {
        this.audio = false;
    }


}
