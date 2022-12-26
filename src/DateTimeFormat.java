import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {

		public static void main(String[] args) {
			
//			LocalDate locale = LocalDate.now().plusDays(1);
//			System.out.println(locale);
//			LocalTime time= LocalTime.now();
//			System.out.println(time);
//			LocalDateTime datetime = LocalDateTime.now().minusDays(1);
//			System.out.println(datetime);
			LocalDateTime localdatetime = LocalDateTime.now();
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:MM:SS");
			String pdf = localdatetime.format(dtf);
			System.out.println(pdf);
			
			
			
		}
	
	
}
