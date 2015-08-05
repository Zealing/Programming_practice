package hello;

import java.util.Scanner;

public class egenvalue {
	public static void main(String[] args) {
		
//		initialize
		Scanner in = new Scanner(System.in);
		int number;
		int digit = 1;
		int digit_number;
		int odd_even;
		int bidigit=1;
		int bivalue = 0;
		
		System.out.print("please enter number: ");
		number = in.nextInt();
		if (number >= 0 && number <= 100000){
		while (number > 0 && number <= 100000)
		{
			digit_number = number % 10;
			number = number / 10;
			if (((digit_number % 2 == 0) && (digit % 2 == 0)) || ((digit_number % 2 != 0) && (digit % 2 != 0))){
				bivalue = bivalue + bidigit;
			}
			digit = digit + 1;
			bidigit = bidigit * 2;
		} 
		
		System.out.println("the egenvalue equals to " + bivalue);
		} else {
			System.out.println("error number!");
		}
	}

}
