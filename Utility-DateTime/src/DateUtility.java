import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

public class DateUtility {

	public Map<String, Integer> dateDifference(LocalDate start, LocalDate end) {
		Map<String, Integer> result = new LinkedHashMap<String, Integer>();
		result.put("days", Math.abs(Period.between(start, end).getDays()));
		result.put("months", Math.abs(Period.between(start, end).getMonths()));
		result.put("years", Math.abs(Period.between(start, end).getYears()));
		return result;
	}
	
	public long yearsBetween(LocalDate start, LocalDate end) {
		return Math.abs(ChronoUnit.YEARS.between(start, end));
	}
	
	public long monthsBetween(LocalDate start, LocalDate end) {
		return Math.abs(ChronoUnit.MONTHS.between(start, end));
	}
	
	public long daysBetween(LocalDate start, LocalDate end) {
		return Math.abs(ChronoUnit.DAYS.between(start, end));
	}
}
