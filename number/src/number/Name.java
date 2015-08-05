package number;

//import java.awt.List;
import java.util.*;
import java.util.Collections;

public class Name implements Comparable <Name>{ //应用 comparator 来自定义排序的根据--哪个大哪个小
	private String firstName, lastName;
	

	public Name(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}

	public boolean equals (Object obj) {
		if (obj instanceof Name) {
			Name name = (Name) obj;
			return (firstName.equals(name.firstName)) && lastName.equals(name.lastName);
		}
		
		return super.equals(obj);
	}
	
	public int hashCode() {
		return firstName.hashCode();
	}
	
	@Override
	public int compareTo (Name o) {
		// TODO Auto-generated method stub
		Name n = (Name) o; //必须要复制一个强制类型转换然后再比较大小--除了安全考虑之外还有 immutability
		int lastCmp = lastName.compareTo(n.lastName);
		
		return (lastCmp != 0 ? lastCmp:firstName.compareTo(n.firstName));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new LinkedList();
		l1.add(new Name("Kate", "M"));
		l1.add(new Name("Tom", "S"));
		l1.add(new Name("Ellen", "T"));
		l1.add(new Name("Allen", "T"));
		
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}

}
