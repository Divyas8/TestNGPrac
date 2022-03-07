package com.demo.java;

public class UpCa {

	public static void main(String[] args) {
		
		upc();
		System.out.println(upc1());
		upc2("helloworld");
		System.out.println(upc3("asdfhasda"));
		
		UpCa x=new UpCa();
		x.upc4();
		System.out.println(x.upc5());
		x.upc6("ksAAAASDSDASdlas");
		System.out.println(x.upc7("ksAAAASDSDASdlas"));
	}
	//static
	//without return type and no parameters
	public static void upc() {
		String str="asdfada";
		System.out.println(str.toUpperCase());
	}
	//with return type and no parameters
	public static String upc1() {
		String str="akfsdha;sdjf";
		return(str.toUpperCase());
	}
	//without return type and with parameters
	public static void upc2(String str) {
		System.out.println(str.toUpperCase());
	}
	//with return type and with parameters
	public static String upc3(String str) {
		return(str.toUpperCase());
	}
	
	
	//Non Static
	//without return type and no parameters
	public void upc4() {
		String str="AFLHSD;A";
		System.out.println(str.toLowerCase());
	}
	//with return type and no parameters
	public String upc5() {
		String str="ASDFADS";
		return(str.toLowerCase());
	}
	//without return type and with parameters
	public void upc6(String str) {
		System.out.println(str.toLowerCase());
	}
	//with return type and with parameters
	public String upc7(String str) {
		return(str.toLowerCase());
	}
	
	
	

}
