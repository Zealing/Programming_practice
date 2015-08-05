package number;

import java.awt.*;

public class TestLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("mememe");
		
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		p2.setLayout(new BorderLayout());
		p1.setLayout(new GridLayout());
		
		Button button1 = new Button("1");
		Button button2 = new Button("2");
		Button button3 = new Button("3");
		
//		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40));//这边说明 flowlayout 已经 implement 了 layoutmanager 的接口--多态
//		f.setLayout(new GridLayout(3, 4));
		
		f.add(p1, BorderLayout.CENTER);
		f.add(p2, BorderLayout.NORTH);
		
		for (int i = 0; i < 8; i++) { //一次性添加多个按钮
			p1.add(new Button("Button" + i));
		}
		
		p2.add(button1, BorderLayout.EAST);
		p2.add(button2, BorderLayout.WEST);
		p2.add(button3, BorderLayout.NORTH);
		
		f.pack();//包裹得正好--如果没有设置 frame 大小的时候用 pack 就可以直接显示合适的大小
		
//		f.add(button1, BorderLayout.EAST);
//		f.add(button2, BorderLayout.WEST);
//		f.add(button3, BorderLayout.CENTER);
//		
		
//		f.setSize(100, 100);
		f.setVisible(true);
	}

}
