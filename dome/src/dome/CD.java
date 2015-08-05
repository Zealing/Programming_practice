package dome;

public class CD extends Item {
	private int numOfTracks = 0;
	
	public CD(String title, int not) {
		super(title); //调取父类的构造函数
		numOfTracks = not;
	}
	
	public int getNot(){
		return numOfTracks;
	}
	
	public void print(){
		super.print();
		System.out.println(numOfTracks);
	}
	
	public static void main(String[] args) {
		CD cd = new CD("Owl City", 7);
		cd.print();
		System.out.println(cd.getNot());

	}

}
