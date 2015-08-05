package number;

public class TestInherit2 {

	static class Person 
	{
		private String name;
		private String location;
		
		Person(String name) {
			this.name = name;
			this.location = "beijing";
		}
		
		Person(String name, String location) {
			this.name = name;
			this.location = location;
		}
		
		public String info() {
			return ("name: " + name + " location " + location);
		}
	}
	
	static class Student extends Person
	{
		private String school;
		
		Student (String name, String school) {
			this(name, school, "beijing");//直接写 this 代表这个类的成员变量
		}

		Student(String n, String l, String school) {
			// TODO Auto-generated constructor stub
			super(n, l);
			this.school = school;
		}
		
		public String info() {
			return super.info() + " school: " + school;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("A");
		Person p2 = new Person("B", "shanghai");
		
		Student s1 = new Student("C", "S1");
		Student s2 = new Student("C", "shanghai", "S2");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
		
//		Student tom = new Student("tom", "haidianyizhong");
//		tom.info();
//		Student allen = new Student("allen", "fujian", "fuzhousanzhong");
//		allen.info();
	}

}
