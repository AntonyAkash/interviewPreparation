package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateTimeformat {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		String s=LocalDate.now().format(DateTimeFormatter.ofPattern("yyy-dd"));
		System.out.println(s);
	}

}
