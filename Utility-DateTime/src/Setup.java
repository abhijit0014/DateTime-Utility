import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

public class Setup {
	public static void main(String args[]) {
		
		LocalDate st = LocalDate.of(2018, 10, 23);
		DateUtility utilityDate = new DateUtility();
		Map diff1 = utilityDate.dateDifference( LocalDate.now(),st);
		System.out.println(diff1.toString());	
		
		
		LocalTime t1 = LocalTime.of(13, 01, 00);
		LocalTime t2 = LocalTime.of(15, 00, 00);
		TimeUtility utilityTime = new TimeUtility();
		Map diff2 = utilityTime.timeDifference(t1, t2);
		System.out.println(diff2.toString());
		
		System.out.println(utilityTime.HoursFormat12(t2));
	}
}