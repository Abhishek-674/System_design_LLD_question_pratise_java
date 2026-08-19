package TaskScheduler;

import java.util.UUID;

public class Task {
    String id;
    String name;
    TaskStatus  status;
    Runnable action;
    SchedulingStrategy schedulingStrategy;
    public Task(String name, Runnable action,SchedulingStrategy schedulingStrategy) {
        this.name = name;
        this.action = action;
        this.id = UUID.randomUUID().toString();
        this.status=TaskStatus.CREATED;
        this.schedulingStrategy = schedulingStrategy;

    }
    void execute() {
        this.status=TaskStatus.RUNNING;
        try {

            action.run();
            this.status=TaskStatus.COMPLETED;
        }
        catch (Exception e) {
            this.status=TaskStatus.FAILED;
        }
        System.out.println(this.status);
    }

    void setSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

}
