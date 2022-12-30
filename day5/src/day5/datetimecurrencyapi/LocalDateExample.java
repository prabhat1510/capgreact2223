package day5.datetimecurrencyapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author UD SYSTEMS Example of New Date Time API introduced in Java 1.8
 *         LocalDate - final class in java.time LocalDateTime - final class in
 *         java.time
 */
public class LocalDateExample {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		System.out.println(yesterday);
		System.out.println(tomorrow);
		// when creating a boolean variable ensure that you start with "is"
		Boolean isLeapYear = LocalDate.now().isLeapYear();
		System.out.println(isLeapYear);
		int dayOfMonth = 31;
		int monthData = 12;
		int yearData = 2020;
		Boolean checkLeapYear = LocalDate.of(yearData, monthData, dayOfMonth).isLeapYear();
		System.out.println(checkLeapYear);

		LocalDate dateToCheckLeapYear = LocalDate.of(2016, 1, 31);
		System.out.println(dateToCheckLeapYear.isLeapYear());

		LocalDate dateTime = LocalDate.of(2021, 10, 15);
		System.out.println(dateTime);
		LocalDateTime dateWithTime = dateTime.atTime(1, 50, 9);
		System.out.println(dateWithTime);
		System.out.println(LocalDateTime.now());

		// Time in milliseconds -- since Java 1.8 below method
		System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
		System.out.println(Instant.now().toEpochMilli()); // Current system time in milliseconds
		// Eaarlier verison of Java we used below method to get current System time in
		// milliseconds
		System.out.println(System.currentTimeMillis());

		// Get current date
		LocalDate currentDate = LocalDate.now();// YYYY-MM-DD
		String strDate = currentDate.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Ccurrent date in string -------" + strDate);
		// strDate variable contains date in YYYY-MM-DD format
		System.out.println(currentDate.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));

		LocalDate date1 = LocalDate.now();
		System.out.println("Date1 -----" + date1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		String text = date1.format(formatter);
		System.out.println("text -----" + text);
		LocalDate parsedDate = LocalDate.parse(text, formatter);
		System.out.println("parsedDate------" + parsedDate);

		// Convert string into a LocalDate'
		String dateString = "2022-08-01";
		LocalDate d1 = LocalDate.parse(dateString);
		System.out.println(d1);
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getMonthValue());
		System.out.println(d1.getMonth());
		
		LocalDateTime dT= LocalDateTime.now();
		System.out.println(dT);
		System.out.println(dT.getHour());
		System.out.println(dT.getMinute());
		System.out.println(dT.getSecond());
		System.out.println(dT.getNano());
		System.out.println(dT.format(DateTimeFormatter.ofPattern("yyyy MM dd HH mm SS")));
		
	}
}
