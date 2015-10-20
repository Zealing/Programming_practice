package OOP_Practice;

public class Display {

	private int limit = 0;
	private int value = 0;
	
	public void increase() { 
		value++;
		if (value == limit) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public Display(int limit) {
		// TODO Auto-generated constructor stub
		this.limit = limit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
