package dome;

public class DVD extends Item {
	private String director = "";
	
	public DVD(String title, String director) {
		super(title);
		this.director = director;
		// TODO Auto-generated constructor stub
	}

	public void print(){
		super.print();
		System.out.println(director);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
