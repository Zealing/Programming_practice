package OOP_Practice;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class MyPanel extends JPanel {

	public void paintComponent(Graphics g){
		
		g.fillRect(255, 255, this.getWidth(), this.getHeight());
		
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillOval(70, 70, 100, 100);
	}
	
	public static void main(String[] args) {

	}

}
