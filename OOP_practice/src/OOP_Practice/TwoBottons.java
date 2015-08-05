package OOP_Practice;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.*;

public class TwoBottons { //外部类不用 implement actionlistener now--inner class example
	JFrame frame;
	JLabel label;
	
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("change the label"); //不是在内部类定义这些按键的对象，而是在外部类中定义！！
		JButton colorButton = new JButton("change the color");
		
		labelButton.addActionListener(new LabelListener()); //将内部类用在这边才能 register
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel("I'm a label");
		MyPanel mypanel = new MyPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.CENTER, mypanel);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public TwoBottons() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoBottons gui = new TwoBottons();
		gui.go();
	}

	class LabelListener implements ActionListener{
		public void actionPerformed(ActionEvent event) { //当按键 event 发生的时候让按键做事----event handling
			label.setText("Ohhh!");
		}
	}
	
	class ColorListener implements ActionListener{
		public void actionPerformed(ActionEvent event) { //当按键 event 发生的时候让按键做事----event handling
			frame.repaint();
		}
	}
	
}
