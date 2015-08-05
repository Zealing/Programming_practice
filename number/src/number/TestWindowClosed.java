package number;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowClosed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame("MyFrame55");
	}

	static class MyFrame extends Frame
	{
		MyFrame (String s) {
			super(s);
			setLayout(null);
			setBounds(200, 200, 400, 400);
			setVisible(true);
			this.setBackground(Color.RED);
			
//			this.addWindowListener(new MyWindowMonitor());
			
			//直接在里面写函数---匿名内部类--不需要重新定义类的名字--当成 windowadapter 来用
			this.addWindowListener(new WindowAdapter() 
			{
				public void windowClosing (WindowEvent e) 
				{
					setVisible(false);
					System.exit(-1);
				}
			});
			
		}
	}
}

//class MyWindowMonitor extends WindowAdapter {
//	public void windowClosing (WindowEvent e) {
//		System.exit(-1);
//	}
//}
