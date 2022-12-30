package day5.datetimecurrencyapi;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author UD SYSTEMS java.util.Date java.util.Calendar
 */
public class DateExample {

	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("Our first date is : " + date1);
		/*
		 * Allocates a {@code Date} object and initializes it to represent the specified
		 * number of milliseconds since the standard base time known as "the epoch",
		 * namely January 1, 1970, 00:00:00 GMT.
		 */
		Date date2 = new Date(99999999999L);

		System.out.println("Our second date is : " + date2);

		Date date3 = new Date(999999999999L);

		System.out.println("Our third date is : " + date3);
		if(date1.after(date2)) {
			System.out.println("Our first date is after our second date.");
		}
		if(date2.before(date3)) {
			System.out.println("Our second date is before our third date");
		}
		
		System.out.println(date1.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(sdf.format(date1));
		System.out.println(sdf.format(date2));
		System.out.println(sdf.format(date3));
		
		//Get Date and Time separately after formatting 
		String formattedDate = sdf.format(date3);
		System.out.println(formattedDate);
		String[] dates= formattedDate.split(" ");
		for(String date : dates) {
			System.out.println(date);
		}
	}

}
