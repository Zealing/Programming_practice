package OOP_Practice;

import java.util.Scanner;

public class Newtown_method {
	private double c = 0;
	private double t = 0;
	
	public Newtown_method (){
		System.out.println("please enter the number: ");
		Scanner in = new Scanner(System.in);
		double ret = in.nextDouble();

		this.t = ret;
		this.c = ret;
	}
	
	public double abs(double number){
		if (number < 0 ) {
			number = -number;
		} 
		
		return number;
	}
	
	//求平方根的一般套路
	public double sqrt(){
		double err = 1e-15;//设置一个精度
		if (c < 0) { 
			return Double.NaN;
		}
		else {
			this.t = c;
			while (abs(t - c/t) > err*t){ //判断前一个的值减去后一个的值是否大于精度
				t = (c/t + t)/2.0;
			}
		}
		
		return t;
	}
	
	public void print(){
		System.out.println("the square root of " + c + " is: " + t);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		double a = in.nextDouble();
		Newtown_method a = new Newtown_method ();
		a.sqrt();
		a.print();
	}

}
