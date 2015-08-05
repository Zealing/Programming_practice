package OOP_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class max3 {
	private int a[] = new int[3];
	private int max = 0;
	
	public max3() {
		// TODO Auto-generated constructor stub
		System.out.println("please enter number: ");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 3; i++){
			this.a[i] = in.nextInt();
		}
	}
	
	public int compare(){
		max = a[0];
		for (int i = 1; i < a.length; i++){
			if (a[i] > max){
				max = a[i];
			}
		}
		
		return max;
	}
	
	public void print(){
		System.out.println("the max number is: " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max3 c = new max3();
		c.compare();
		c.print();
	}
}
