package OOP_Practice;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;//专门用来画图的工具
import java.awt.event.*;

public class SimpleAnimation {
	private int x = 70;
	private int y = 70;
	
	
	public SimpleAnimation() {
		// TODO Auto-generated constructor stub
	}

	public void go() {
		JFrame frame = new JFrame();//initialize the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel panel = new MyPanel(); //initialize the panel
		
		frame.getContentPane().add(panel);//let panel into the frame
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		for (int i = 0; i < 130; i++){
			x++;
			y++;
			
			panel.repaint();//是 JPanel 里面的函数--重画
			
			try {						//没学过
				Thread.sleep(50);
			} catch(Exception ex) {}
		}
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}

}
