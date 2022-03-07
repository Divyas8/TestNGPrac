package com.demo.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class JSimp {
	public static void main(String[] args) {
	//String Reversal
//		String str="mom";
//		
//		String rev="";
//		StringBuilder sb=new StringBuilder(str);
//		sb.reverse();
//		rev=sb.toString();
// System.out.println(rev);
// 
// StringBuffer st=new StringBuffer(str);
// st.reverse();
// System.out.println(st);
	
//	//Pallendrome	
// if(str.equals(rev)) {
//	System.out.println("pallindrome");
// }else {
//	 System.out.println("not palindrome");
// }
 
		//finding largest and smallest number in array		
// int a[]= {9,8,3,5,6,2};
// Arrays.sort(a);
// for(int i=a.length-1;i>=0;i--) {
//	 System.out.print(a[i]+"  ");
// }System.out.println();
// System.out.println("smallest number is "+  a[0]);
// System.out.println("largest number is "+  a[a.length-1]);
		
		
		//number of time string is repeated and the string
String a="Divya Varun Pallavi Divya Raghu BajiV Divya Varun";
 String b=a.toLowerCase();
 String c[]=b.split(" ");
 int count;
// for(String d: c) {
//	 System.out.print(d+ " ");
// }
 for(int i=0;i<c.length;i++) {//c[0]=Divya
	 count=1;
	 for(int j=i+1;j<c.length;j++) {//c[1]=varun
		 
		 if(c[i].equals(c[j])) {
			count++;
			 c[j]=" ";
		 }
	 }if(count>1&&c[i]!=" ") {
		 System.out.println(c[i]+"   "+count);
	 }}
 
 //using Collections
//		String a="Divya Varun Pallavi Divya Raghu BajiV Divya Varun";
//		 String b=a.toLowerCase();
//		 String c[]=b.split(" ");
//		ArrayList<String> l=new <String> ArrayList();
//		for(int i=0;i<c.length;i++) {
//			l.add(c[i]);
//		}
//		System.out.println(l);
//		int count;
//		for(int j=0;j<l.size();j++) {
//			count=0;
//			for(int k=j+1;k<l.size();k++) {
//				if(l.get(j).equals(l.get(k))) {
//					count++;
//					l.set(k, "0");
//				}
//			}if(count>0 && l.get(j)!="0") {
//				System.out.println(l.get(j));
//			}}
		

 //Removing duplicates from array
//		String a="Divya Varun Pallavi Divya Raghu BajiV Divya Varun";
//		String b[]=a.split(" ");
//	LinkedHashSet h=new LinkedHashSet() ;// for insertion order else HashSet
//	for(int i=0;i<b.length;i++) {
//			h.add(b[i]);
//		}
//		System.out.println(h);
		
	//removing special char, spaces and numbers	
//		String str="Divya3123l;Al jsD4wca  df43a%$@%$d%@E";
//		char a[]= new char[str.length()];
//		char b[]= new char[str.length()];
//		char arr[]= str.toCharArray();
//		for(int i=0;i<arr.length;i++) {
//			if((arr[i]>=65&&arr[i]<=90)||(arr[i]>=97&&arr[i]<=122)) {//Divya31
//				a[i]=arr[i];
//			}
//				else {
//				b[i]=arr[i];
//			}
//		}
//		for(char x: a) {
//			System.out.print(x);
//		}System.out.println();
//		for(char y: b) {
//			System.out.print(y);
//		}
		
		
		
		
		
		
		

	}}
