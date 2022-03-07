package com.demo.java;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//anagram
		//Arrays.equals(arr,arr1);
		
		String a= "peel";
		String b= "leeps";
		char[] arr= a.toCharArray();
		char[] arr1= b.toCharArray();
//		char temp=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				}
//			}
//		}System.out.println(arr);
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=i+1;j<arr1.length;j++) {
//				if(arr1[i]>arr1[j]) {
//				temp=arr1[i];
//				arr1[i]=arr1[j];
//				arr1[j]=temp;
//				}
//			}
//		}System.out.println(arr1);
//		
//		String s= new String(arr);
//		String s1=new String(arr1);
//		
//		if(s.equals(s1)) {
//				System.out.println("given string is anagram");
//			}else {
//				System.out.println("not an anagram");
//			}
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(Arrays.equals(arr, arr1)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}

	}

}
