package number;

import java.awt.*;
import java.awt.event.*;

public class TestActionEvent {

	public TestActionEvent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Frame1");
		Button b = new Button("Press me");
		
		Button c = new Button("Press me111");//对比用的按钮
		
		//新建一个监听器并注册给 b 这个对象--不用调用方法就可以直接输出结果--钩子函数--事件一发生就回来--或者叫回调函数
		Monitor bh = new Monitor();
		b.addActionListener(bh);
		c.addActionListener(bh);
		c.setActionCommand("Game Over");
		//如果自己写个函数主动监听按钮是否被摁下去这个事件--会造成忙等待--其他事件无法进行--浪费资源
		
		f.add(b, BorderLayout.NORTH);
		f.add(c, BorderLayout.CENTER);
		
		f.setVisible(true);
		f.pack();
	}
	
	//事件模型--观察者模式
	static class Monitor implements ActionListener //monitor 本身实现了什么函数不重要--重要的是实现了接口的调用--这样可以直接用--继承
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("A button has been pressed." + "the relative info is: \n" + e.getActionCommand());
			//一种区分哪个按钮被摁下去的方法--不是很好但是很直觉--更好的是分成两个 class来区分不同的实现功能
		}
		
	}
	
}
