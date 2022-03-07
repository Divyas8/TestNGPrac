package com.demo.java;


public class CheckingDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {5,6,8,2,4,6,9}; int range=20;
		if(range<arr.length)
		for(int i=0;i<arr.length-range;i++) {
		for(int j=i+1;j<=i+range;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]+" has a duplicate within range "+range);
			}
		}}
		if(range>=arr.length) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]+" has a duplicate in range "+range);
				}
			}}
		}else {
			System.out.println("There is no duplicate within given range ");
		}

}}
