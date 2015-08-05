package number;

import java.awt.*;
import java.awt.event.*;

public class TFMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TFFrame().launchFrame();
		
	}

	static class TFFrame extends Frame {
		
		TextField tf = new TextField(10);
		TextField tf2 = new TextField(10);
		TextField tf3 = new TextField(15);
		Button equal = new Button("=");
		
		public void launchFrame () {
			
			setLayout(new FlowLayout());
			
			
			add(tf);
			tf.addActionListener(new TFActionListener());
			
			Label lbplus = new Label("+");
			add(lbplus);
			
			add(tf2);
			tf2.addActionListener(new TFActionListener2());
			
			add(equal);
			equal.addActionListener(new ButtonActionListener());
			
			add(tf3);
			tf3.addActionListener(new TFActionListener3());
			
//			tf.setEchoChar('*'); //实现密码的星号功能
			
			pack();
			setVisible(true);
		}
	
		class ButtonActionListener implements ActionListener { //直接使用内部类可以直接使用外部函数的变量
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n1 = Integer.parseInt(tf.getText()); //直接引用！
				int n2 = Integer.parseInt(tf2.getText());
				
				tf3.setText("" + (n1+n2)); //转成字符串的简便方法
	
			}
		}
		
		 class TFActionListener implements ActionListener { //本身只有一个函数/方法
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TextField tf = (TextField)e.getSource();//因为不同的类不能直接引用局部变量！必须这么做
				System.out.println(tf.getText());
	//			tf.setText("");
	
			}
		} 
		
		 class TFActionListener2 implements ActionListener {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TextField tf = (TextField)e.getSource();//因为不同的类不能直接引用局部变量！必须这么做
				System.out.println(tf.getText());
	//			tf.setText("");
	
			}
		}
		
		 class TFActionListener3 implements ActionListener {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TextField tf = (TextField)e.getSource();//因为不同的类不能直接引用局部变量！必须这么做
				System.out.println(tf.getText());
	//			tf.setText("");
	
			}
		}
		}
}
