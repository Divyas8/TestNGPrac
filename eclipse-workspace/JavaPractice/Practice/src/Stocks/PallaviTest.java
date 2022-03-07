package Stocks;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class PallaviTest {

	public static void main(String[] args) {


		//		String s="JavaLanguage";
		//		String a="";int b=6;
		//		for(int i=0;i<s.length()-b+1;i++) {
		//			a=s.substring(i, (i+b));
		//			System.out.println(a);
		//	}

		//		String s="javalanguage";
		//		char [] a=s.toCharArray();
		//		Arrays.sort(a);
		//		
		//				Set<Character> s1 = new LinkedHashSet();
		//				for(int i=0;i<s.length();i++) {
		//					
		//	s1.add(a[i]);}
		//				System.out.println(a);
		//	System.out.println(s1);
		//	ArrayList<Character> l=new<Character> ArrayList();
		//	
		//	for(char x:s1) {
		//		l.add(x);
		//		
		//	}
		//Collections.sort(l);
		//System.out.println(l);

		//String duplicates remove
		//insertion order Linked Hash Set
		//Alphabetic order ArrayList Collections.sort
		//char Array sort Arrays.sort


				int a[]= {29,9,93};
				int b[]= {49,63,1};
				int c[]=new int [a.length+b.length];
		//		for(int i=0;i<a.length;i++) {
		//			c[i]=a[i];
		//		}
		//		for(int i=0;i<b.length;i++) {
		//			c[a.length+i]=b[i];
		//		}
		//	Arrays.sort(c);
		//		for(int i=0;i<c.length;i++) {
		//		System.out.print(c[i]+"  ");
		//		}

		//simplified
				System.arraycopy(a, 0, c, 0, a.length);
				System.arraycopy(b,0,c,a.length,b.length);
				Arrays.sort(c);
//				System.out.println(Arrays.toString(c));
for(int x: c) {
	System.out.print(x+" ");
}


		//without using length()
//		String a="Divya";
//		char b[]=a.toCharArray();
//		int i=0;
//		for(char c: b) {
//			i++;
//		}System.out.println(i);
		
		
		
		
		
		
		

	}}
