import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

public class TimeUtility {

	public Map<String, Long> timeDifference(LocalTime start, LocalTime end) {
		Map<String, Long> result = new LinkedHashMap<String, Long>();
		result.put("hour", Math.abs(Duration.between(start, end).toHours()));
		result.put("minute", Math.abs(Duration.between(start, end).toMinutes())%60);
		result.put("second", Math.abs(Duration.between(start, end).getSeconds())%60);
		result.put("millisecond", Math.abs(Duration.between(start, end).toMillis())%1000);
		return result;
	}
	
	public long hoursBetween(LocalTime start, LocalTime end) {
		return Math.abs(ChronoUnit.HOURS.between(start, end));
	}
	
	public long minutesBetween(LocalTime start, LocalTime end) {
		return Math.abs(ChronoUnit.MINUTES.between(start, end));
	}
	
	public long secondsBetween(LocalTime start, LocalTime end) {
		return Math.abs(ChronoUnit.SECONDS.between(start, end));
	}
	
	public long millisecondsBetween(LocalTime start, LocalTime end) {
		return Math.abs(ChronoUnit.MILLIS.between(start, end));
	}
	
	public String HoursFormat12 (LocalTime time) {
	    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("h:mm:ss a");
	    return fmt.format(time);
	}
	
	public String HoursFormat24 (LocalTime time) {
	    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("k:mm:ss");
	    return time.format(fmt);
	}
}
