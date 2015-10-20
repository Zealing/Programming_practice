package OOP_Practice;

import java.util.ArrayList;

public class Database {

	private ArrayList<CD> listCD = new ArrayList<CD> ();
	
	public void add(CD cd) {
		listCD.add(cd);
		for (i = 0; i <= 10; i++) {
			System.out.println("11");
		}
		
	}
	
	public void list() {
		for (CD cd : listCD) {
			cd.print();
		}
	}
	
	public Database() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("abc", "111", 4, 60, "asdf"));
		db.add(new CD("123123abc", "111", 4, 60, "asdf"));
		db.list();
	}

}
