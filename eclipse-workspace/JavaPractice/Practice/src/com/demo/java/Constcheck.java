package com.demo.java;

public class Constcheck {
private int c;
private int a=10;
private int b=19;
	public  Constcheck(int a, int b) {
		 this.a=a;this.b=b;
		this.c=a+b;
		System.out.println("This is constructor");
		System.out.println(c);
	}
	
	public static String Divya(){
		
		return "Divya";
	}
	public int Varun() {
		return 9;
	}
	public static void Pallavi() {
		
		System.out.println("Pallavi");
	}
 public static void main(String[] args) {
	Constcheck obj=new Constcheck(8,3);
	System.out.println(Divya());
	System.out.println(obj.Varun());
	Pallavi();
	System.out.println();
}
	
	
	
	}


