package OOP_Practice;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import java.math.BigDecimal;

public class Calculator {
	JFrame frame;
	JPanel operationPanel;
	JPanel numberPanel;
	JTextField field;
	JButton plusButton; //创建一个 Java 标准的按键
	JButton minusButton;
	JButton button1;
	JButton button2;
	JButton equalButton;
	JButton decimalButton;


	BigDecimal number1 = new BigDecimal("0.0");
	BigDecimal number2 = new BigDecimal("0.0");
	
	private boolean isPress1 = false;
	private boolean isPress2 = false;
	private boolean isPressDecimal = false;
	
	private String operation;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public void go() {
		frame = new JFrame();
		
		operationPanel = new JPanel();
		numberPanel = new JPanel();
		
		field = new JTextField(20);
		
		plusButton = new JButton("+");
		minusButton = new JButton("-");
		button1 = new JButton("1");
		button2 = new JButton("2");
		equalButton = new JButton("=");
		decimalButton = new JButton(".");
		
		operationPanel.setBackground(Color.gray);
		operationPanel.setLayout(new BoxLayout(operationPanel, BoxLayout.Y_AXIS));
		operationPanel.add(plusButton);
		operationPanel.add(minusButton);
		operationPanel.add(equalButton);
		
		numberPanel.setBackground(Color.darkGray);
//		numberPanel.setLayout(new BoxLayout(operationPanel, BoxLayout.Y_AXIS));
		numberPanel.add(button1);
		numberPanel.add(button2);
		numberPanel.add(decimalButton);
		
		plusButton.addActionListener(new PlusListener());
		minusButton.addActionListener(new MinusListener());
		equalButton.addActionListener(new EqualListener());
		button1.addActionListener(new NumberListener());
		button2.addActionListener(new NumberListener());
		decimalButton.addActionListener(new DecimalListener());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, field);
//		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.EAST, operationPanel);
		frame.getContentPane().add(BorderLayout.CENTER, numberPanel);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	class PlusListener implements ActionListener{
		public void actionPerformed(ActionEvent event) { //当按键 event 发生的时候让按键做事----event handling
			operation = "+";
			field.setText(plusButton.getText());
		}
	}
	
	class MinusListener implements ActionListener{
		public void actionPerformed(ActionEvent event) { //当按键 event 发生的时候让按键做事----event handling
			operation = "-";
			field.setText(minusButton.getText());
		}
	}
	
	class DecimalListener implements ActionListener{
		public void actionPerformed(ActionEvent event) { //当按键 event 发生的时候让按键做事----event handling
			BigDecimal decimal = new BigDecimal("0.0");
			
			if (isPress1 && !isPress2) {
				number1 = number1.add(decimal); 
				isPress1 = true;
				isPressDecimal = true;

				field.setText(number1.toString());

			} else {
				number2 = number2.add(decimal); //enable the multi-operation
				isPress2 = true;
				isPressDecimal = true;
				
				field.setText(number2.toString());
			}
		}
	}
	
	
	class EqualListener implements ActionListener{
		public void actionPerformed(ActionEvent event) { //当按键 event 发生的时候让按键做事----event handling
			BigDecimal result = new BigDecimal("0.0"); 
				
			switch (operation) {
			case "+": result = number1.add(number2);
					  field.setText(result.toString());
					  break;
			case "-": result = number1.subtract(number2);
					  field.setText(result.toString());
					  break;
			}
			
			number1 = result; //let the result be the number1 to used in the next
			number2 = new BigDecimal("0.0");//let number2 initialized
			isPress1 = true;
		}
	}
	
	class NumberListener implements ActionListener{
		public void actionPerformed(ActionEvent event) { //当按键 event 发生的时候让按键做事----event handling
			BigDecimal middle = new BigDecimal(((JButton) event.getSource()).getText());
			if (!isPressDecimal) {
				if (!isPress1) {
					number1 = number1.add(middle); 
					isPress1 = true;
					
					field.setText(((JButton) event.getSource()).getText());
				} else {
					number2 = number2.add(middle); //enable the multi-operation
					isPress2 = true;
					
					field.setText(((JButton) event.getSource()).getText());
				}
			} else {
				if (isPress1 && !isPress2) {
					number1 = new BigDecimal(number1.toString(). + middle.toString());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		calculator.go();
	}

}
