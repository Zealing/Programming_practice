package number;

import java.awt.*;
import java.awt.event.*;

public class TestPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintFrame().launchFrame();
	}
}
	
class PaintFrame extends Frame 
{
	public void launchFrame () {
		setBounds(200, 200, 400, 400);
		setVisible(true);
	}
	
	public void paint (Graphics g) { //就是调用一个画笔--直接画在 frame 里面！//重写的方法--在 container 里面自动调用！--需要重画的时候调用
		Color c = g.getColor();
		g.setColor(Color.red);
		g.fillOval(50, 50, 30, 300);
		g.setColor(Color.green);
		g.fillRect(100, 100, 200, 200);
		g.setColor(c); //恢复现场--良好的编程习惯
		
	}
}

