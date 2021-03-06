package OOP_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {

	private HashMap<Integer, String> coinnames = new HashMap<Integer, String> (); 
	
	public Coin() {
		// TODO Auto-generated constructor stub
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dollar");
	}

	public String getName(int amount) {
		if (coinnames.containsKey(amount)) {
			return coinnames.get(amount);
		}
		else {
			return "NOT FOUND";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
	}

}
