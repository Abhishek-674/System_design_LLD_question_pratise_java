package MeetingSystem;

public class Main {
    public static void main(String[] args) {
        Zoom zoom = new Zoom();
        User u1=new User("Abhishek");
        User u2=new User("Khan");
        User u3=new User("Aditya");
        User u4=new User("Rishi");
        User u5=new User("Maitray");
        User u6=new User("AMna");
        User u7=new User("Bittu");
        Participants p1=new Participants(u1);
        Participants p2=new Participants(u2);
        Participants p3=new Participants(u3);
        Participants p4=new Participants(u4);
        Participants p5=new Participants(u5);
        Participants p6=new Participants(u6);
        Participants p7=new Participants(u7);

        Meeting m1=zoom.createMeetings(u7);
        m1.joinMeeting(p1);
        m1.joinMeeting(p2);
        m1.joinMeeting(p3);
        m1.joinMeeting(p4);

         m1.addMessage(u1,"Hello wait for 10 min i will be joining in ");
         m1.addMessage(u2,"okay we will be waiting");
         m1.leaveMeeting(p4);
         zoom.endMeetings(m1);
         m1.joinMeeting(p5);


    }
}
