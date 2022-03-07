package com.demo.java;

public class Short {

	public static void main(String[] args) {
		
tri();
System.out.println(tri1());
tri2(" asd ");
System.out.println(tri3(" adsfa "));

Short obj=new Short();
obj.tri4();
System.out.println(obj.tri5());
obj.tri6(" asd ");
System.out.println(obj.tri7(" adsfa "));

	}
	public static void tri() {
		String str="  a a d ";
		System.out.println(str.trim());
	}public static String tri1() {
		String str=" asdaf ";
		return str.trim();
	}public static void tri2(String str) {
		System.out.println(str.trim());
	}public static String tri3(String str) {
		return str.trim();
	}
	
	public  void tri4() {
		String str="  a a d ";
		System.out.println(str.trim());
	}public  String tri5() {
		String str=" asdaf ";
		return str.trim();
	}public  void tri6(String str) {
		System.out.println(str.trim());
	}public  String tri7(String str) {
		return str.trim();
	}

}
