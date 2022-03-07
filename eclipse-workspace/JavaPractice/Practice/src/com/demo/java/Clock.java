package com.demo.java;

public class Clock {

	public static void main(String[] args) {
		String s="Geekforgeeks", b="ksgeekforgee";
		int n=3;
		String x=(s.substring(s.length()-n)+ s.substring(0,(s.length()-n)));
		System.out.println(b.equals(x));
		System.out.println(s.substring(10,11));
		System.out.println(x);
	}

}
