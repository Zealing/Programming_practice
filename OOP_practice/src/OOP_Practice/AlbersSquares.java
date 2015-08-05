package OOP_Practice;

import java.awt.Color; //using color class in program
import java.util.Scanner;

public class AlbersSquares {

	public AlbersSquares() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color red = new Color(255, 0, 0);
		Color bookBlue = new Color(9, 90, 166);
		
		System.out.println("please enter color values: ");
		Scanner in = new Scanner(System.in);
		int r1 = in.nextInt();
		int g1 = in.nextInt();
		int b1 = in.nextInt();
		
		System.out.println(r1 + g1 + b1);
		
		Color c1 = new Color(r1, g1, b1);
		
		int r2 = in.nextInt();
		int g2 = in.nextInt();
		int b2 = in.nextInt();
		
		System.out.println(r2 + g2 + b2);
		Color c2 = new Color(r2, g2, b2);
		
//		int red = 0;
//		int green = 0;
//		int blue = 0;
//		
//		double x = 1;
//		double y = 0.01;
//		double size = 0.008;
//		
//		for (int i = 0; i < 85; i++){
//			for (int j = 0; j < 85; j++){
//				StdDraw.setPenColor(red, green, blue);
//				StdDraw.filledSquare(x, y, size);
////				red += 3;
//				green += 2;
//				blue += 3;
////				x -= 0.01;
//				y += 0.014;
//			}
//			
//			green = 0;
//			blue = 0;
//			y = 0.01;
//			red += 3;
//			x -= 0.014;
			
//			for (int j = 0; j < 10; j++){
//				StdDraw.setPenColor(red, green, blue);
//				StdDraw.filledSquare(x, y, size);
//				red++;
//				green++;
//				blue++;
//				x += 0.01;
//				y += 0.01;
//			}
//			
			
		}
		
//		StdDraw.setPenColor(100, 100, 100);
//		StdDraw.filledSquare(.25, .5, .2);
//		StdDraw.setPenColor(200, 100, 100);
//		StdDraw.filledSquare(.25, .5, .1);
//		StdDraw.setPenColor(100, 100, 100);
//		StdDraw.filledSquare(.75, .5, .2);
//		StdDraw.setPenColor(250, 100, 100);
//		StdDraw.filledSquare(.75, .5, .1);
	}

//}
