package com.inheritance;

import com.demo.java.Constcheck;

public class classC extends classB{
	
	public String stud="Divya";
	public int num=1;
	public char sec='C';
	
	
	
	
	public void marks(int a, int b, int c) {
		
		System.out.println(a+b+c);
	}
public void marks(int a, char b) {
		
		System.out.println(a+b);
	}
public void marks(int a, int  b, int  c, long d) {
	
	System.out.println(a+b+c+d);
}
	
	
	
public void admin1() {
	super.admin();
	super.stop();
	super.exam();
	System.out.println("welcome to college Divya");
	System.out.println(super.univ);
}
	
	
	private  void start() {
		System.out.println("varun");
	}
	public void cls() {
		System.out.println("please listen to class");
	}
	public void bunk() {
		System.out.println("life lessons");
	}
	public void breaks() {
		System.out.println("peet pooja time");
	}
	
	public static void main(String[] args) {
		
		classC o =new classC(); 
		o.exp();
		o.admin();
		o.exam();
		o.place();
		o.cls();
		o.bunk();
		o.breaks();
		System.out.println("&&&&&&&&&&&&7");
//		o.start();
		System.out.println("*******");
		Constcheck l=new Constcheck(4, 9);
		
		
		System.out.println(o.clg);
		System.out.println(o.univ);
		System.out.println(o.dep);
		System.out.println(o.stud);
		System.out.println(o.num);
		System.out.println(o.sec);
		System.out.println("*************");
		o.admin1();
		
	}
//	
//	try {
//		
//	}catch( Exception e) {
//		e.printStackTrace();
//	}
//	
	
	
	

}
