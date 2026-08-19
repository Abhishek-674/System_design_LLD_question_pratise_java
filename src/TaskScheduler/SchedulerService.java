package TaskScheduler;

import java.util.HashMap;
import java.util.Map;

public class SchedulerService {
    Map<String,Task> taskmap;
    public SchedulerService(){
        taskmap=new HashMap<String,Task>();
    }
    void scheduleTask(Task task){
        taskmap.put(task.id,task);
    }
    void  cancelTask(Task task){
        taskmap.remove(task.id);
    }
    void executeTask(Task task){
        task.execute();
    }


}
