package number;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyMouseAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame("drawing..");
		Scanner s = new Scanner(System.in);
	}
}

class MyFrame extends Frame 
{
	ArrayList<Point> points = null;
	
	public MyFrame(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		points = new ArrayList<Point>();
		
		setLayout(null);
		setBounds(200, 200, 400, 400);
		this.setBackground(Color.BLUE);
		setVisible(true);
		
		this.addMouseListener(new Monitor());
	}
	
	public void paint(Graphics g) { //每次点击都要重写 Paint 函数
		Iterator<Point> i = points.iterator();
		while (i.hasNext()) {
			Point p = (Point)i.next();
			g.setColor(Color.RED);
			g.fillOval(p.x, p.y, 10, 10);
		}
	}
	
	public void addPoint(Point p) {
		points.add(p);
	}
	
	class Monitor extends MouseAdapter //这个类型接口 implements 了 mouselistener 的功能！！如果写的是 mouseListener 的话必须在类里面写上所有的接口--即便是空的
	{ //这就是extends的好处--如果是 implements 就要把所有的方法都实现了
		public void mousePressed (MouseEvent e) {
			MyFrame f = (MyFrame)e.getSource();
			f.addPoint(new Point(e.getX(),e.getY()));
			f.repaint();//非常重要！！每次点击都要！！
			//不能直接调用 paint()--因为不知道画笔在哪里！
		}
	}
	
	
	/*
	class Monitor1 implements MouseListener 
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	*/
}

