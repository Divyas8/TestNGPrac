package Stocks;

public class User {

	public static void main(String[] args) {
		
		Upstox r = new Upstox();
		r.depositories();
		r.participants();
		r.securities();
		r.brokerage();
		r.charge();
		System.out.println();
		
		Zerodha a=new Zerodha();
		a.depositories();
		a.participants();
		a.securities();
		a.brokerage();
		a.charge();
		
	}

}
