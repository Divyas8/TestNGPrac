package com.demo.java;

public class Spy {

	public static void main(String[] args) {
		int num=123;
		String x=String.valueOf(num);
		String[] y= x.split("");
		int j=0,k=1;
		for(int i=0;i<y.length;i++) {
			j=j+Integer.parseInt(y[i]);
			k=k*Integer.parseInt(y[i]);
		}System.out.println(j+" "+k);
		if(j==k) {
			System.out.println("it is a spy number");
		}else {
			System.out.println("not a spy number");
		}
	}
}
