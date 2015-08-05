package OOP_Practice;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;

public class GUI implements ActionListener{ //implement the interface
	JButton button; //创建一个 Java 标准的按键
	JFrame frame;
	JPanel panel;
	JButton button2;
	JTextField field;
	
	public GUI() {
		// TODO Auto-generated constructor stub
	}
	
	public void go(){
		frame = new JFrame();
		button = new JButton("change color");
		button2 = new JButton("Hit me!");
		panel = new JPanel();
//		field = new JTextField(20);
		field = new JTextField("Your name");
		
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//将 panel 的 Layout 管理者更换为 BOX，根据 Y 轴换行
		
		Font bigFont = new Font("serif", Font.BOLD, 28);//修改字体--尽量用 OOP 的形式而不是直接修改 button 内部的参数
		button.setFont(bigFont);
		field.setFont(bigFont);
		
		button.addActionListener(this); //将按键这个对象添加进监听列表里---register with the button
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel mypanel = new MyPanel();
		
		panel.add(button);
		panel.add(button2);
//		frame.getContentPane().add(BorderLayout.SOUTH, button);
//		frame.getContentPane().add(BorderLayout.CENTER, mypanel);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.getContentPane().add(BorderLayout.NORTH, field);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) { //当按键 event 发生的时候让按键做事----event handling
		frame.repaint();
	}
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.go();
	}

}
