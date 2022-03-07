package com.demo.java;

public class Duplicatecheck {

	public static void main(String[] args) {



		int range = 4;

		int [] arr =  {5, 6, 8, 2, 4, 6, 9 };

		range = (range>arr.length)?range= arr.length-1:range;


		System.out.println(range);


		for(int i=0; i<arr.length; i++) {

			for(int j=i+1; j<=(range +i) && !(j>=arr.length); j++) {


				System.out.println(arr[i] + "  " + arr[j]);


				if(arr[i] ==  arr[j]) {
					System.out.println("Duplicate Found in  iteration:" + arr[i]);
				}
			}}
	}}
