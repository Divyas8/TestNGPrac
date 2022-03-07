package com.demo.java;

public class Index {

	public static void main(String[] args) {
		in();
		System.out.println(in1());
		in2('l',"helloworld");
		System.out.println(in3('a',"Divya"));
		
		Index o=new Index();
		o.in4();
		System.out.println(o.in5());
		o.in6('l',"helloworld");
		System.out.println(o.in7('a',"Divya"));

	}public static void in() {
		String str="HelloWorld";
		System.out.println(str.indexOf('H'));
	}public static int in1() {
		String str="Divya";
		return str.indexOf('v');
	}public static void in2(char c,String str) {
		System.out.println(str.indexOf(c));
	}public static int in3(char c, String str) {
		return str.indexOf(c);
	}
	public  void in4() {
		String str="HelloWorld";
		System.out.println(str.indexOf('H'));
	}public  int in5() {
		String str="Divya";
		return str.indexOf('v');
	}public  void in6(char c,String str) {
		System.out.println(str.indexOf(c));
	}public  int in7(char c, String str) {
		return str.indexOf(c);
	}

}
