package TaskScheduler;

import java.time.LocalDateTime;
import java.util.Date;

public interface SchedulingStrategy {
    LocalDateTime getNextExecutionTime();
}
