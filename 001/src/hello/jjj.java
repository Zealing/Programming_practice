package hello;

import java.util.Scanner;

public class jjj {
	public static void main(String[] args) {
		
//		initialize
		Scanner in = new Scanner (System.in);
//		BJT's
		int number;
		int hours;
		int minutes;
//		UTC's
		int time;
		int UTC;
		int UTChours;
		int UTCminutes;
		int UTCtime;
		
//		enter time
		System.out.print("please enter BJT: ");
		number = in.nextInt();
		
//		decide whether it is a valid time 
		if (number > 2359 || number < 0)
		{
			System.out.print("error time");
		} else{
		
//		read the hours and the minutes separately
		hours = number / 100;
		minutes = number % 100;
		
//		change to minute unit
		time = hours * 60 + minutes;
		
//		calculate the UTC time in minute unit
		UTC = time - 8 * 60;
		
		if(UTC < 0)
		{
			int extra = 480 - time;
			UTC = 1440 - extra;
		}
		
//		get the UTC's hours and minutes
		UTChours = UTC / 60;
		UTCminutes = UTC % 60;
		
		if (UTCminutes == 60)
		{
			UTCminutes = 0;
			UTChours = UTChours + 1;
		}
		
//		get the ultimate UTC time in valid format
		UTCtime = UTChours * 100 + UTCminutes;
		System.out.print("UTC equals to " + UTCtime);
		}
	}
}
