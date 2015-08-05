package number;

import java.awt.*;

public class TestFrame {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f1 = new MyFrame (100, 100, 200, 200, Color.BLUE);
		MyFrame2 f2 = new MyFrame2 ("MyFramehahaha", 100, 100, 500, 500);
		
		
	}

	static class MyFrame extends Frame { //直接继承父类 frame
		static int id = 0;
		MyFrame (int x, int y, int w, int h, Color color) {
			super ("MyFrame" + (++id));
			setBackground(color); //可以直接调用父类的函数
			setLayout(null);
			setBounds(x,y,w,h);
			setVisible(true);
		}
	}
	
	static class MyFrame2 extends Frame {
		private Panel p1, p2, p3, p4;
		MyFrame2 (String s, int x, int y, int w, int h) {
			super(s);
			setLayout(null);
			p1 = new Panel(null); p1.setBackground(Color.BLUE);
			p2 = new Panel(null); p2.setBackground(Color.PINK);
			p3 = new Panel(null); p3.setBackground(Color.MAGENTA);
			p4 = new Panel(null); p4.setBackground(Color.BLACK);
			p1.setBounds(0, 0, 100, 100);
			p2.setBounds(100, 100, 100, 100);
			p3.setBounds(200, 200, 100, 100);
			p4.setBounds(300, 300, 100, 100);
			add(p1); add(p2); add(p3); add(p4);
			setBounds(x, y, w, h);
			setVisible(true);
		}
	}
	
}
