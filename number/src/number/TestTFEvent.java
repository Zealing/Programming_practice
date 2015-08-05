package number;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestTFEvent {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TFFrame();
	}

	static class TFFrame extends Frame {
		TFFrame () {
			TextField tf = new TextField();
			add(tf);
			tf.addActionListener(new TFActionListener());
			
			tf.setEchoChar('*'); //实现密码的星号功能
			
			pack();
			setVisible(true);
		}
	}
	
	static class TFActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			TextField tf = (TextField)e.getSource();//因为不同的类不能直接引用局部变量！必须这么做
			System.out.println(tf.getText());
			tf.setText("");
			
			//另外一种方法--直接引用
//			System.out.println(((TextField)e.getSource()).getText());
//			((TextField) e.getSource()).setText("");
		}
		
	}
	
}
