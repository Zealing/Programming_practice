package OOP_Practice;

public class Body { 
	private Vector r; //position
	private Vector v; //velocity
	private final double mass;
	
	public Body(Vector r0, Vector v0, double m0) {
		// TODO Auto-generated constructor stub
		r = r0; 
		v = v0;
		mass = m0;
	}
	
	public void move(Vector f, double dt) {
		Vector a = f.times(1/mass); //acceleration;
		v = v.plus(a.times(dt)); //new v = original v + (acceleration * passing time) 
	}
	
	public void draw() {
		StdDraw.setPenRadius(0.025);
		StdDraw.point(r.cartesian(0), r.cartesian(1));
	}
	
	public Vector forceFrom(Body b){
		Body a = this;
		double G = 6.67e-11;
		Vector delta = a.r.minus(b.r); //vector from b to a
		double dist = delta.magnitude();
		double F = (G * a.mass * b.mass) / (dist * dist);
		
		return delta.direction().times(F);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
