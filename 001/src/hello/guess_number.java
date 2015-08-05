package hello;

import java.util.Scanner;

public class guess_number {
	public static void main(String[] args) {
	//	initialize
		Scanner in = new Scanner(System.in);
		int number = (int) (Math.random() * 100 + 1);
		
		int a;
		int count = 0;{
		do {
			a = in.nextInt();
			count = count + 1;
			if (a > number){
				System.out.println("too large!");
			}
			else if (a < number){
				System.out.println("too small!");
			}
		} while (a != number);
		System.out.println("You win! the count number is: " + count);
}
}}
