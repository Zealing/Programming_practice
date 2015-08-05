package hello;

import java.util.Scanner;

public class TicketMachine {
	
	private int price = 100;
	private int balance;
	private int total;
	private String name = "";
	
	public TicketMachine(int i){
		price = i;
	}
	
	public TicketMachine(String name) {
		this.name = name;
	}
	
	public TicketMachine(String name, int price){
		this(name);
		this.price = price;
	}
	
	public void showPrompt(){
		System.out.println("Welcome to buy " +name + " Line ticket.");
		System.out.println("the price is: " + price);
	}
	
	public void insertMoney(int bill){
		balance += bill;
		printBalance();
	}
	
	public void printTicket(){
		if (balance >= price){
			System.out.println("THE TICKET");
			if (balance > price){
				System.out.println("change is: " + (balance - price));
			}
			balance -= price;
		}
	}
	
	public boolean isEnough(){
		return balance >= price;
	}
	
	public void printBalance(){
		System.out.println("Balance is: " + balance);
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		TicketMachine tm = new TicketMachine("blue", 80);
		tm.showPrompt();
		
		int bill;
		do {
			bill = in.nextInt();
			tm.insertMoney(bill);
			if (tm.isEnough()) {
				tm.printTicket();
				break;
			}
		} while (true);
		
		tm.insertMoney(80);
		tm.insertMoney(30);
		tm.printTicket();

	}
}
