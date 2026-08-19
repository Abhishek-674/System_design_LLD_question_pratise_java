package MeetingSystem;

public class ParticipantsObserver implements MeetingObserver {
    Participants p;
    public ParticipantsObserver(Participants p) {
        this.p = p;
    }
    @Override
    public void update(String msg) {
        System.out.println("Notification for: "+p.user.name+ " "+msg);
    }

}
