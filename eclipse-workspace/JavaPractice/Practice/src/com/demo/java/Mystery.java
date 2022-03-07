package com.demo.java;

public class Mystery {

	public static void main(String[] args) {
		int num= 132, count=0;
		int[] x= {1,2,3,4,5,6,7,8,9};
		int[] y= {1,2,3,4,5,6,7,8,9};
		for(int a=0;a<x.length;a++) {
			for(int b=0;b<y.length;b++) {
				
					if(((1*b)+(10*a)+(1*a)+(10*b))==num) {
						if(a==b) {
							continue;
						}
						System.out.println("number is mystery number "+a+" "+b);
					count++;
					}
			}
		}if(count>0) {
			System.out.println("it is mystery number");
		}else {
			System.out.println("not a mystery number");
		}
		

	}

}
