package Encapsulation;

import java.util.Arrays;

public class Testfunc {
	public static void Func(String a, int b) {
		
		char[] c=a.toCharArray();
		char ch=' ';
		char[] d= new char[b];
		for(int i=0;i<c.length;i++) {
		d[i]=c[i];	
		}for(int i=c.length;i<b;i++) {
			d[i]=ch;
		}
		
		Arrays.toString(d);
		System.out.print(d);
		
	}

}
