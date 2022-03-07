package Stocks;

public class Methods {
private static void Add(int a, int b) {
	int c=a+b;
	System.out.println(c);
	
}


	
	public static void main(String[] args) {
		//call by reference
	int a=30,b=40;
	Methods.Add(a, b);
	
	//call by value
	Methods.Add(30, 80);
		
	}

}
