package com.demo.java;

public class Classes {
 
public static void main(String[] args) {
		
		width("hello");
		System.out.println(width2("world"));
		System.out.println(width3());
		width4();
		Classes obj=new Classes();
		obj.width5("Divyassss");
System.out.println(obj.width6("asdfhaksd"));
System.out.println(obj.width7());
obj.width8();
}
	public static void width(String str) {
	char[] arr= str.toCharArray();
	int x=arr.length;
	System.out.println(x);
}
	public static int width2(String str) {
		char[] arr=str.toCharArray();
		int x=arr.length;
		return x;
		
	}
	public static int width3() {
		String str="Helloworld";
		return str.length();
		
	}
	public static void width4() {
		String str="Helloworld";
		System.out.println(str.length());
	}
	public void width5(String str) {
		char[] arr= str.toCharArray();
		int x=arr.length;
		System.out.println(x);
		
	}public int width6(String str) {
		char[] arr=str.toCharArray();
		int x=arr.length;
		return x;
		
	}	public int width7() {
		String str="Helloworld";
		return str.length();
		
	}public void width8() {
		String str="Helloworld";
		System.out.println(str.length());
	}
	
}