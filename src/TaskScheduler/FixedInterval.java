package TaskScheduler;

import java.time.LocalDateTime;
import java.util.Date;

public class FixedInterval implements SchedulingStrategy{
    Long fixedIntervalTime;
    LocalDateTime previousExecutionTime;

    public FixedInterval(Long fixedIntervalTime, LocalDateTime previousExecutionTime){
        this.fixedIntervalTime = fixedIntervalTime;
        this.previousExecutionTime = previousExecutionTime;
    }
    @Override
    public LocalDateTime getNextExecutionTime() {
        return previousExecutionTime.plusMinutes(fixedIntervalTime);
    }
}
