package OOP_Practice;

public class Vector {
	private final double coords[];
	
	
	public Vector(double [] a) {
		// TODO Auto-generated constructor stub
		this.coords = new double [a.length];
		for (int i = 0; i < a.length; i++){
			this.coords[i] = a[i];
		}
	}
	
	public Vector plus(Vector b) {
		double c[] = new double[coords.length];
		for (int i = 0; i < coords.length; i++){
			c[i] = coords[i] + b.coords[i];
		}
		
		return new Vector(c);
	}

	public Vector minus(Vector b) {
		double c[] = new double[coords.length];
		for (int i = 0; i < coords.length; i++){
			c[i] = coords[i] - b.coords[i];
		}
		
		return new Vector(c);
	}
	
	public Vector times(double t) {
		double c[] = new double[coords.length];
		for (int i = 0; i < coords.length; i++){
			c[i] = coords[i] * t;
		}
		
		return new Vector(c);
	}
	
	public double dot(Vector b) {
		double c = 0.0;
		for (int i = 0; i < coords.length; i++){
			c = c + (coords[i] * b.coords[i]);
		}
		
		return c;
	}
	
	public double magnitude() { //自己乘自己的平方根
		return Math.sqrt(this.dot(this));
	}
	
	public Vector direction() { //自己除以自己的 magnitude
		return this.times(this.magnitude());
	}
	
	public double cartesian(int i) {
		return coords[i];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
