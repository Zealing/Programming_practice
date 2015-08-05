package clock;


public class Clock {
	private Display hour = new Display (24); //hour是 display 的管理者
	private Display minute = new Display (60);
	
	public void tick(){
		minute.tick();
		if (minute.getValue() == 0){
			hour.tick();
		}
	}
	
	public void show(){
//		System.out.println(hour.getValue() + ": " + minute.getValue());
		System.out.println(hour+ ": " + minute);
//		System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
	}
	
	public Clock() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock();
		while ( true ) {
			c.tick();
			c.show();
		}
	}

}
