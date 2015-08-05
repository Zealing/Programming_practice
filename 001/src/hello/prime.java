package hello;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
//		int n;
		int count = 0;
		int sum = 0;
		
		System.out.print("please enter number: (n m)");
		int small = in.nextInt();
		int large = in.nextInt();
		
		for (int n = 2; count < large; n++){
			int isPrime = 1;
			for (int i = 2; i < n; i++){
				if (n % i == 0){
					isPrime = 0;
					break;
				} 
			}
			if (isPrime == 1){
//				System.out.println(n);
				count++;
				if (count >= small && count <= large){
					sum = sum + n;
				}
			} 
		}
		
		System.out.println("the sume is: " + sum);
	}
}
