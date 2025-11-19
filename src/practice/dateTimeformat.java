package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeformat {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		String s=LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yy hh:mm:ss"));
		System.out.println(s);
	}
}
