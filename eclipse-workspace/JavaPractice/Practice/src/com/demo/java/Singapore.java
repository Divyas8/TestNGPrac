package com.demo.java;

public class Singapore {
	//NRIC card --check digit
	public static void main(String[] args) {
		String a= "S",b= "9875431",c= "2765432",y="JZIHGFEDCBA",d="XWUTRQPNMLK";
		int j=0,x=0;
		String[] arr1 = b.split("");	
		String[] arr2 = c.split("");

		for(int i=0;i<arr1.length; i++) {
			j=j+(Integer.parseInt(arr1[i])* Integer.parseInt(arr2[i]));
		}
		if(a=="S") {
			x=j%11;
		}else if (a=="T" || a=="G") {
			x=(j+4)%11;
		}
		if(a=="S"||a=="T") {
			System.out.println(a+b+y.charAt(x));
		}else if(a=="F"|| a=="G") {
			System.out.println(a+b+d.charAt(x));
		}
	}
}
