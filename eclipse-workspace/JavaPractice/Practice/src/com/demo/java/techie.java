package com.demo.java;

public class techie {

	public static void main(String[] args) {
int num=21425;int c=0; int d=1;
		
		String x=String.valueOf(num);
		if(x.length()%2==0) {
		

	
		
	int a= Integer.parseInt(x.substring(0, x.length()/2));
int b=	Integer.parseInt(x.substring( x.length()/2, x.length()));
		
		c=a+b;
		d=c*c;
		
		if(d==num) {
			System.out.println("number is tech number");
		}else {
			System.out.println("not a tech number");
		}
		}else if(x.length()%2!=0){
			System.out.println("given num must have even number of digits");
		}
		

	}

}
