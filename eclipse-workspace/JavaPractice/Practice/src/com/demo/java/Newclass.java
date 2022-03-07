package com.demo.java;

public class Newclass {
// distance between 2 words in a sentance 
	public static void main(String[] args) {
		String s="Akash glaced at alesha carefully everytime he looked at her he was falling in love all over again";
		String a="at", b="he";
		
		String[] arr=s.split(" ");
	
		int c=0, d=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(a)) {
				c=i;
				break;
				
			}}
		
			for(int j=0;j<arr.length;j++) {
				if(arr[j].equals(b)) {
			
				d=j;
				break;
				}
			}
		
		
			System.out.println((d-c)-1);	
		
		}
		
		
		
		
	}

