package number;

public class TestEqual {

	public TestEqual() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat(1,2,3);
		Cat c2 = new Cat(1,2,6);
		System.out.println(c1.equals(c2));
	}
	
	static class Cat 
	{
		int color;
		int height;
		int weight;
		
		public Cat (int color, int height, int weight) {
			this.color = color;
			this.height = height;
			this.weight = weight;
		}
		
		public boolean equals(Object obj) { //当创造了自己的类的时候 equals 基本都要重写
			boolean result = false;
			if (obj == null) result = false;
			else {
				if(obj instanceof Cat) {
					Cat c = (Cat)obj; //强制转换
					if(c.color == this.color && c.height == this.height && c.weight == this.weight) {
						result = true;
					}
				}
			}
			return result;
		}
	}

}
