package dome;

import java.util.ArrayList;


public class Database {
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void add(Item i){
		items.add(i);
	}
	
	public void list(){
		for ( Item i: items){
			i.print();
			System.out.println();
		}
	}
	
	public Database() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		CD cd = new CD("Owl City", 7);
		DVD dvd = new DVD("dahuaxiyou", "Jay CHOU");
//		db.add(new CD("Owl City", 7));
//		db.add(new DVD("dahuaxiyou","Jay CHOU"));
		Item i = cd;
		i.print();
		i.getNot();
		db.list();
	}

}
