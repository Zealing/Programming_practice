package OOP_Practice;

public class Calendar {
	private int year = 0;
	private int month = 0;
	private int totalday = 0; //first day in a month
	private int day = 0; //a month's first day's week
	private int normalYear [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int leapYear [] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Calendar(int a, int b) {
		this.year = b;
		this.month = a;
	}

	public void weekNumber (){
		this.totalday = (this.year - 1970) * 365 + monthDay() + leapYearNumber() + 3;
		this.day = this.totalday % 7;
		System.out.println(totalday);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}
	
	public int leapYearNumber(){
		int cnt = 0;
		if (this.month < 3) {
			for (int i = 1970; i < this.year; i++){
				if (isLeapYear() == 1){
					cnt ++;
				}
			}
		} else {
			for (int i = 1970; i < this.year + 1; i++){
				if (isLeapYear() == 1){
					cnt ++;
				}
			}
		}
		
		return cnt;
	}
	
	public int monthDay(){
		int sumDay = 1;
		if (this.month != 1){
			if (isLeapYear() == 0) {
				for (int i = 0; i < this.month-1; i++){
					sumDay += normalYear [i];
				}
			} else {
				for (int i = 0; i < this.month-1; i++){
					sumDay += leapYear [i];
				}
			}
		}
		return sumDay;
	}
	
	public int isLeapYear(){
		int ret = 0;
		if ( (this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
			ret = 1;
		} else {
			ret = 0;
		}
		
		return ret;
	}
	
	public void print(){
		int length = 0;
		if (isLeapYear() == 0) {
			length = normalYear[this.month - 1] +this.day;
		} else {
			length = leapYear[this.month - 1] +this.day;
		}
		int result [] = new int[length];
		
		for (int i = this.day; i < result.length; i++){
			result[i] = i+1;
		}
		
		System.out.printf("Sun\tMon\tTue\tWed\tThu\tFri\tSar\n");
		for (int i = 0; i<result.length; i++){
			if (i % 7 == 0 && i != 0) {
				System.out.printf("\n%d\t", result[i]);
			} else if (result[i] == 0){
				System.out.printf("\t");
			} else {
				System.out.printf("%d\t", result[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Calendar a = new Calendar(2, 1974);
		a.weekNumber();
		a.print();
	}

}
