package com.demo.java;

public class KrishnamurthyNumber {

	public static void main(String[] args) {
		int num=25, a=0;
		
		String x=String.valueOf(num);
		String[] y= x.split("");
		
		for(int i=0;i<y.length;i++) {
			int z=1;
		for(int j=Integer.parseInt(y[i]);j>0;j--)
				{
			z=z*j;
			
			}
		a=a+z;
			
		}
		System.out.println(a);
}}
