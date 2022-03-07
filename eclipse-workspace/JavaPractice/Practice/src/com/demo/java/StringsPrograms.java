package com.demo.java;

import java.util.Arrays;

public class StringsPrograms {

	public static void main(String[] args) {
	//special characters in a string	
//String str="Good Morning! Mr. James Potter. Had your breakfast?";
//int count=0;
//char a[]= str.toCharArray();
//for(int i=0;i<a.length;i++) {
//	if((a[i]>=65&&a[i]<=90)||(a[i]>=97&&a[i]<=122)||(a[i]==' ') ){
//		continue;
//	}count++;
//	System.out.print(a[i]);
//}System.out.print("            "+count);

		//count of total number of vowels and consonents in a string
//		String str1="This is a really simple sentence"  ;
//	String	str=str1.toLowerCase();
//		int v=0,c=0;
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
//				v++;
//			}
//			else if(str.charAt(i)>'a' && str.charAt(i)<='z'){
//				c++;
//			}
//			}System.out.println(v+"    "+c);	
		
		//Anagram
//		String str= "Grab", str1 = "Brag";
//	str=	str.toLowerCase();str1=str1.toLowerCase();
//		char a[]=str.toCharArray();
//		char b[]=str1.toCharArray();
//		Arrays.sort(a);
//		Arrays.sort(b);
//		if(Arrays.equals(a, b)) {
//			System.out.println("anagram");
//		}else {
//			System.out.println("not anagram");
//		}
		
		
		//divide a string in equal parts
		String s="aaaabbbbcccc";
		int n=3;
		int part = s.length()/ n;
	
		System.out.print(s.charAt(0));
				for(int i=1;i<s.length();i++) {
					if(i%part ==0)
					{
						System.out.println();
					}System.out.print(s.charAt(i));
				}
		
		
		
		
		
		
		
		
		
		
	}}
