package TaskScheduler;

import java.time.LocalDateTime;
import java.util.Date;

public class OneTime implements SchedulingStrategy {
    LocalDateTime executionTime;
    public OneTime(LocalDateTime executionTime) {
        this.executionTime = executionTime;
    }
    @Override
    public LocalDateTime getNextExecutionTime() {
        return executionTime;
    }
}
