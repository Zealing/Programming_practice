package OOP_Practice;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import java.math.BigDecimal;

public class test {
	private int a[] = {1, 2, 3};
	
	public test() {
		// TODO Auto-generated constructor stub
	}
	
	public void plus(int b[]){
		a = b;
//		a[0] = 2;
		for (int i = 0; i < a.length; i++){
			System.out.printf("%d\t", b[i]);
		}
		
		System.out.printf("\n");
		
		for (int i = 0; i < a.length; i++){
			System.out.printf("%d\t", a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal number1 = new BigDecimal(1);
		BigDecimal number2 = new BigDecimal("0.0");
		BigDecimal sum = new BigDecimal("1.0");
		
		number2 = number2.add(sum);
		
		System.out.println(number2);
	}

}
