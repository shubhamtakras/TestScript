package practice;

import java.time.LocalDateTime;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date currentdate = new Date();
		
		System.out.println(currentdate);
		
		LocalDateTime currentDatetime = LocalDateTime.now();
		
		System.out.println(currentDatetime);
	}

}
