package TaskScheduler;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        SchedulerService schedulerService = new SchedulerService();

        Task t1=new Task("Send email",()->{System.out.println("Sending email");},new OneTime(LocalDateTime.now()));
        Task t2=new Task("Send sms",()->{System.out.println("Sending sms");},new FixedInterval((long)(4),LocalDateTime.now()));
        schedulerService.scheduleTask(t1);
        schedulerService.scheduleTask(t2);
        schedulerService.executeTask(t2);
        System.out.println(t1.schedulingStrategy.getNextExecutionTime());
        System.out.println(t2.schedulingStrategy.getNextExecutionTime());
    }
}
