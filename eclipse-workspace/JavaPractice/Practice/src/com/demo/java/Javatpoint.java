package com.demo.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Javatpoint {

	public static void main(String[] args) {
		//1)count the total number of characters in a string
		//		String a="DivyaSindri";
		//		System.out.println(a.length());

		//2)count the total number of characters in a string 2
		//		String a="Varun",b="Raj";
		//		System.out.println(a.length()+b.length());

		//3)count the total number of punctuation characters exists in a String
		//		String a="Divya!%Varun&Pallavi#389@";
		//		String c="!-_&@:;'/,.?";
		//		int count=0;
		//		for(int i=0;i<c.length();i++) {
		//			for(int j=0;j<a.length();j++) {
		//				if(c.charAt(i)==a.charAt(j)) {
		//					count++;
		//				}}}System.out.println(count);

		//4)count the total number of vowels and consonants in a string
		//		String a="Divya 8is  good @coder";
		//		String v="aeiouAEIOU";int vcount=0,conscount=0;
		//		a.toLowerCase();
		//		for(int i=0;i<a.length();i++) {
		//			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
		//				vcount++;
		//			}else if(a.charAt(i)>='a'&&a.charAt(i)<='z') {
		//				conscount++;
		//			}
		//		}	System.out.println("vowels count in string      "+vcount);
		//		System.out.println("Consonant count in string    "+conscount);

		//	5)whether two strings are the anagram
		//		String a="leep", b="yeel"; 
		//		char c[]=a.toCharArray();
		//		char d[]=b.toCharArray();
		//		if(a.length()==b.length()) {
		//		Arrays.sort(c);
		//		Arrays.sort(d);
		//		if(Arrays.equals(c, d)) {
		//			System.out.println("anagram");
		//		}else {
		//			System.out.println("not an anagram");
		//		}
		//		}else {
		//			System.out.println("not an anagram");
		//		}

		//	6)divide a string in 'N' equal parts.
		//		String a="divyaisagoodcod";
		//		int n=3;
		//		int part=a.length()/n;
		//		String ne="";
		//		if(a.length()%n==0) {
		//			System.out.print(a.charAt(0));
		//		for(int i=1;i<a.length();i++) {
		//			if(i%part==0) {
		//				System.out.println();
		//			}System.out.print(a.charAt(i));
		//		}
		//		}else{
		//			System.out.println("cannot divide the string into equal parts");
		//		}

		//10) remove whitespaces
		//		String a="Divya is a good girl";
		//		String c=a.replaceAll(" ", "");
		//		System.out.println(c);
		//		String b="";
		//		for(int i=0;i<a.length();i++) {
		//			if(a.charAt(i)==' ') {
		//				continue;
		//			}
		//			b=b+a.charAt(i);
		//			
		//		}System.out.println(b);


		//7)find all subsets of a string
		//		String a="Java";		//j, ja, jav, java, a, av, ava, v, va, a
		//		String b="";
		//		for(int i=0;i<a.length();i++) {
		//			for(int j=i+1;j<a.length()+1;j++) {
		//			
		//			System.out.println(a.substring(i,j));
		//		}}


		//8)longest repeating sequence in a string
		//		String a="Divya Pallavi varun Divya varun varun";
		//		a.toLowerCase();
		//		String b[]=a.split(" ");
		//		for(int i=0;i<b.length;i++) {int count=1;
		//		for(int j=i+1;j<b.length;j++) {
		//			if(b[i].equals(b[j])) {
		//				count++;
		//				b[j]=" ";
		//			}}
		//		if(count>1&&b[i]!=" ") {
		//			System.out.println(b[i]+"   "+count);
		//		}
		//		}

		//		3159
		//				for(int i=0;i<10;i++) {
		//					for(int j=0;j<35;j++) {
		//						if(((i==0||i==4||i==9)&& (j<10))||((i==0||i==4||i==9)&& (j>17&&j<24))|| 
		//								((i==0||i==4||i==9)&&j>28)) {
		//							System.out.print("*");
		//						}else if(j==9|| j==13|| (j==17&&i<4)||(j==23&&i>4) || ((j==28&&i<4)||j==34)) {
		//							System.out.print("*");
		//						}
		//						else {
		//							System.out.print(" ");
		//						}
		//					}System.out.println();
		//				}


		//P
		//		for(int i=0;i<10;i++) {
		//			for(int j=0;j<10;j++) {
		//				if(i==0||i==4) {
		//					System.out.print("*");
		//				}else if(j==0||(j==9&& i<4)) {
		//					System.out.print("*");
		//				}else {
		//					System.out.print(" ");
		//				}
		//			}
		//			System.out.println();
		//		}


		//F
		//		for(int i=0;i<=6;i++) {
		//			for(int j=0;j<5;j++) {
		//				if(i==0||i==3) {
		//					System.out.print("*");
		//				}else if(j==0) {
		//					System.out.print("*");
		//				}
		//			}System.out.println();
		//		}

		//Z
		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<5;j++) {
		//				if(i==0||i==4) {
		//					System.out.print("*");
		//				}else if(i+j==4) {
		//					System.out.print("*");
		//				}else {
		//					System.out.print(" ");
		//				}
		//			}System.out.println();
		//		}

		//M
		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<5;j++) {
		//				if(j==0||j==4) {
		//					System.out.print("*");
		//				}else if(i+j==4 &&i<3 || ((i==j)&&i<2)) {
		//					System.out.print("*");
		//				}
		//				else {
		//					System.out.print(" ");
		//				}
		//			}System.out.println();
		//		}

		//N
		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<5;j++) {
		//				if(j==0||j==4) {
		//					System.out.print("*");
		//				}else if(i==j) {
		//					System.out.print("*");
		//				}
		//				else {
		//					System.out.print(" ");
		//				}
		//			}System.out.println();
		//		}

		//A
		//		int count=5;
		//		for(int i=0;i<5;i++) {
		//			
		//			for(int j=0;j<10;j++) {
		//			if(i+j==count || j==count+i) {
		//				System.out.print("*");
		//			}
		//			else {
		//				System.out.print(" ");
		//			}
		//			}
		//			if(i==1) {
		//				System.out.println();
		//			
		//			for(int k=0;k<10;k++) {
		//				if(k>=count-(i+1)&&(k<=count+(i+1))) {
		//					System.out.print("*");
		//				}else {
		//					System.out.print(" ");
		//				}
		//			}
		//			i++;
		//			}
		//			System.out.println();
		//		}


		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<9;j++) {
		//				
		//				if((i+j)/2>=3) {
		//					System.out.print("*");
		//				}
		//				else {
		//					System.out.print(" ");
		//				}
		//			}System.out.println();
		//		}



		//remove all the duplicates from the string
		//		String s="java";
		//		char x[]=s.toCharArray();
		//		Set a=new LinkedHashSet();
		//		for(int i=0;i<s.length();i++) {
		//			a.add(x[i]);
		//		}System.out.println(a);

		//		JavaLa
		//		avaLan
		//		vaLang
		//		aLangu
		//		Langua
		//		anguag
		//		nguage
//		String s="JavaLanguage";
//		String a="";int b=7;
//		for(int i=0;i<s.length()-b+1;i++) {
//			a=s.substring(i, (i+b));
//			System.out.println(a);
//		}



		//without using length()
//		String a="Divya";
//		char b[]=a.toCharArray();
//		int i=0;
//		for(char c: b) {
//			i++;
//		}System.out.println(i);


	}}
