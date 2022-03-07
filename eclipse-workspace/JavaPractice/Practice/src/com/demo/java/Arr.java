package com.demo.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		
//	int []a = {1,2,3,4};
//	int sum=0;
//	for(int i=0;i<a.length;i++) {
//		sum=sum+a[i];
//	}System.out.println(sum);
		
		
//		String str= "varun";
//		char arr[]=str.toCharArray();
//		String s="";
//		for(int i=str.length()-1;i>=0;i--) {
//			s=s+arr[i];
//			
//		}System.out.println(s);
		
	
//	StringBuilder sb=new StringBuilder(str);
//	
//	sb.reverse();
//	System.out.println(sb);
		
//	String str= "This is Divya Automation EngineeR";
//	String lower="", upper="";
//	int Ucount =0, lcount=0;
//	for(int i=0;i<str.length();i++) {
//		char c=str.charAt(i);
//		if(c>='a' && c<='z') {
//			
//			lower =lower+c;
//			lcount++;
//		}else if (c>='A' && c<='Z') {
//			upper=upper+c;
//			Ucount++;
//		}
//	}System.out.println(lower+ "    "+lcount);
//	System.out.println(upper+"    "+Ucount);
//		
		
		
//biggest number of two without if 
//		int a=0, b=8;
//	System.out.println( a>b?a:b);
	
		
		
	//swap 2 numbers without using 3rd variable;
//		int a=4, b=8;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+"  "+b);
		
		
//reverse a number
//		int n=4586;
//		StringBuilder sb=new StringBuilder(String.valueOf(n));
//		sb.reverse();
//		System.out.println(sb);
//		int i= Integer.parseInt(sb.toString());
//		System.out.println(i);
		
		//or
		
//		int n=4586, reverse=0,c;
//		while(n>0) {//false
//			c=n%10;//6//8//5//4
//			reverse=reverse*10+c;//6//68//685//6854
//			n=n/10;//458//45//4//0
//		}System.out.println(reverse);
//		
	 

		// largest number in array
//		int a[]= {1,6,4,5,3,9};
//	Arrays.sort(a);
//	System.out.println(a[a.length-1]+" "+a[a.length-2]);
		
		
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				if((i==0||i==4||i==9)||((j==0&& i<5)||j==9&& i>5)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println();
//		}
		
		
		
//		String s="Divya";
//		String t="Sindri";
//		System.out.println(s+"    "+t);
//		s=s+t;
//		System.out.println(s);
//		t=s.substring(0, s.length()-t.length() );
//		s=s.substring(t.length());
//		System.out.println(s+"    "+t);
		
	//reverse string
		String a="Divya";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b + a.charAt(i);
		}System.out.println(b);
		
		
		
		
		
		
		
	
	}}
