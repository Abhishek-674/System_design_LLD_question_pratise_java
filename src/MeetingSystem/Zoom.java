package MeetingSystem;

import java.util.ArrayList;
import java.util.List;

public class Zoom {
    List<Meeting> onGoingMeetings;
    public Zoom()
    {
        onGoingMeetings=new ArrayList<Meeting>();
    }
    Meeting createMeetings(User host) {
        Meeting meeting = new Meeting(host);
        onGoingMeetings.add(meeting);
        System.out.println("Meeting is created by "+host.name+" "+meeting.meetingId);
        return meeting;
    }
    void endMeetings(Meeting meeting) {
        meeting.isActive=false;
        System.out.println(meeting.meetingId +"Meeting has been ended");
        onGoingMeetings.remove(meeting);
    }


}
