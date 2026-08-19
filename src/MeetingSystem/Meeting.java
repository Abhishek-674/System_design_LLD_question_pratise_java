package MeetingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Meeting {
    String meetingId;
    List<Participants> participants;
    List<ParticipantsObserver> observers;
    List<ChatMessage> messages;
    User host;
    boolean isActive;
    public Meeting(User host) {
        this.meetingId = UUID.randomUUID().toString() ;
        this.participants = new ArrayList<Participants>();
        this.observers = new ArrayList<ParticipantsObserver>();
        this.messages=new ArrayList<ChatMessage>();
        this.host = host;
        isActive=true;
    }
    void addparticipants(Participants p){
        this.participants.add(p);

    }
    void removeparticipants(Participants p){
        this.participants.remove(p);
    }
    void addobserver(ParticipantsObserver o){
        this.observers.add(o);
    }
    void removeobserver(MeetingObserver o){
        this.observers.remove(o);
    }
    void  addMessage(User u,String msg){
        ChatMessage m1= new ChatMessage(u,msg);
        this.messages.add(m1);
        String s = u.name+" has send a msg";
        notifyParticipants(s);
    }
    void removeMessage(ChatMessage m){
        this.messages.remove(m);
    }
    void notifyParticipants(String msg){
         for(MeetingObserver p:observers )
         {
             p.update(msg);
         }
    }
    void joinMeeting(Participants p)
    {
        if(this.isActive==false)
            System.out.println("Metting has ended ");
        else {
            this.participants.add(p);
            String msg=p.user.name+" has Joined the meeting";
            notifyParticipants(msg);
            ParticipantsObserver o =new ParticipantsObserver(p);
            observers.add(o);
        }



    }
    void leaveMeeting(Participants p)
    {
        this.removeparticipants(p);
        participants.remove(p);
        String msg=p.user.name+" has left the meeting";
        notifyParticipants(msg);
    }


}
