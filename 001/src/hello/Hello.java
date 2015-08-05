package hello;

import java.io.InputStream;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
//		initialize
		Scanner in = new Scanner(System.in);
		
//		enter the coin number
		System.out.print("please insert coin: ");
		int amount = in.nextInt();
		System.out.print(amount>=10);
		
//		print out ticket
		if (amount >=10)
		{
			System.out.println("ticket done: 10 dollars");
			
	//		calculate the change
			System.out.println("change is: " + (amount - 10));
		}
		if(amount == 10)
		{
			
		}
	}

}
