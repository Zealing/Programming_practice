package OOP_Practice;

import java.util.Scanner;

public class Universe {
	private final int N; //物体个数
	private final double radius; //确定宇宙的半径
	private final Body [] orbs; //确定物体的相对位置
	
	public Universe() {//初始化一个宇宙并根据输入的物体个数确定相对位置
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the amount of bodies: ");
		N = in.nextInt();
		
		System.out.println("please enter the radius of the universe: ");
		radius = in.nextDouble();
		StdDraw.setXscale(-radius, +radius);
		StdDraw.setYscale(-radius, +radius);
		orbs = new Body[N];
		
		for (int i = 0; i < N; i++) { //画出物体的初始位置
			System.out.println("please enter the body's position x and y: ");
			double rx = in.nextDouble();
			double ry = in.nextDouble();
			double[] position = {rx, ry};//设定初始位置
			
			System.out.println("please enter the body's initial velocity x and y: ");
			double vx = in.nextDouble();
			double vy = in.nextDouble();
			double[] velocity = {vx, vy};//设定初始速度
			
			System.out.println("please enter the body's mass: ");
			double mass = in.nextDouble();//设定质量
			
			Vector r = new Vector(position);//defensive copy to ensure immutability
			Vector v = new Vector(velocity);
			orbs[i] = new Body(r, v, mass);//设定物体
		}
	}
	
	public void increaseTime(double dt) {
		Vector[] f = new Vector[N]; //设定一个vector 的数组，共有 N 个
		for (int i = 0; i < N; i++){
			f[i] = new Vector(new double[2]); 
		}
		
		for (int i = 0; i < N; i++){
			for (int j = 0; j < N; j++){
				if (i != j) {
					f[i] = f[i].plus(orbs[i].forceFrom(orbs[j])); //给每个物体一个初始相互作用力
				}
			}
		}
		
		for (int i = 0; i < N; i++){
			orbs[i].move(f[i], dt); //跟随时间而移动每个物体
		}
	}
	
	public void draw() {
		for (int i = 0; i < N; i++){
			orbs[i].draw(); //画出每个物体--根据当前位置
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Universe newtown = new Universe();
		
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the amount of times: ");
		double dt = in.nextDouble();
		
		while (true) {
			StdDraw.clear();
			newtown.increaseTime(dt);
			newtown.draw();
			StdDraw.show(10);
		}
	}

}
