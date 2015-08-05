package number;

import java.awt.*;
import java.awt.event.*;

public class TestKeyEvent {
	public static void main(String[] args) {
		new MyFrame1().launchFrame();
	}
}


class MyFrame1 extends Frame 
{
	public void launchFrame() {
		setBounds(200, 200, 400, 400);
		setVisible(true);
		
		this.addKeyListener(new MyKeyMonitor());
	}
	
	class MyKeyMonitor extends KeyAdapter 
	{
		public void keyPressed (KeyEvent e) {
//			System.out.println("OK");
			int keycode = e.getKeyCode();
			if(keycode == KeyEvent.VK_UP) {
				System.out.println("UP");
			}
		}
	}
	
}
