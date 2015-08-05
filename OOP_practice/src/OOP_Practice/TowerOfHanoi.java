package OOP_Practice;

import java.util.Scanner;

public class TowerOfHanoi {

	public TowerOfHanoi() {
		// TODO Auto-generated constructor stub
	}
	
	public static void moves(int n, boolean left){ //using recursion to solve hanoi problem
		if (n == 0) {
			return;
		}
		moves(n-1, !left);
		if (left) {
			System.out.println(n + " Left");
		} else {
			System.out.println(n + " Right");
		}
		moves(n-1, !left);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the level number and beginning position: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean left = in.nextBoolean();
		moves(n, left);
	}

}
