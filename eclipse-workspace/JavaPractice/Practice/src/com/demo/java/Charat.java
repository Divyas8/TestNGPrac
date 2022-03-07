package com.demo.java;

public class Charat {

	public static void main(String[] args) {
		car();
		System.out.println(car1());
		car2(2,"afsdfasd");
		System.out.println(car3(3,"asfdfasd"));
		
		Charat obj=new Charat();
		String s="divya";
		obj.car4();
		System.out.println(obj.car5());
		obj.car6(2,s);
		System.out.println(obj.car7(3,s));

	}public static void car() {
		String s= "fahsd;alfjsd";
		char[] a=s.toCharArray();
		System.out.println(a[1]);
	}public static char car1() {
		String s="aflskd";
		char[] a=s.toCharArray();
		return (a[3]);
	}public static void car2(int index, String c) {
		char[] a=c.toCharArray();
		System.out.println(a[index]);
	}public static char car3(int index, String d) {
		char[] a=d.toCharArray();
		return a[index];
	}
	
	public  void car4() {
		String s= "fahsd;alfjsd";
		char[] a=s.toCharArray();
		System.out.println(a[1]);
	}public  char car5() {
		String s="aflskd";
		char[] a=s.toCharArray();
		return (a[3]);
	}public  void car6(int index, String c) {
		char[] a=c.toCharArray();
		System.out.println(a[index]);
	}public  char car7(int index, String d) {
		char[] a=d.toCharArray();
		return a[index];
	}

}
