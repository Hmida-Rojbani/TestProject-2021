package feature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class TestDate {
	
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.of(22, 15);
		LocalDateTime dt;
		ZonedDateTime zdt;
		
		System.out.println(d.getDayOfWeek() +"  "+d.getMonth());
	}

}
