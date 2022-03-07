package Collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList {

	public static void main(String[] args) {
		//frequency of Array
		//		int a[]={1, 2, 8, 3, 2,0, 2, 2, 5, 1 ,0};
		//		for(int i=0;i<a.length;i++) {
		//			int count=1;
		//			for(int j=i+1;j<a.length;j++) {
		//				if(a[i]==a[j]) {
		//					count++;
		//					a[j]= ' ';
		//				}}
		//			if(a[i]!=' ') {
		//				System.out.println(a[i]+"   "+count);
		//			}}

		//left rotate the elements
		//		int a[]={1, 2, 3, 4, 5 };
		//		int c=a[0];
		//		for(int i=0;i<a.length-1;i++) {
		//			a[i]=a[i+1];
		//		}
		//		a[a.length-1]=c;
		//		System.out.println(Arrays.toString(a));

		//duplicate elements of an array
		//		int a[]={1, 2, 8, 3, 2,0, 2, 2, 5, 1 ,0};
		//		for(int i=0;i<a.length;i++) {int count=1;
		//			for(int j=i+1;j<a.length;j++) {
		//				if(a[i]==a[j]) {
		//					count++;
		//					a[j]=' ';
		//				}
		//			}if(a[i]!=' '&& count>1) {
		//				System.out.print(a[i]+"   ");
		//			}}

		//		elements of an array present on even position
		//		int[] a= {1,3,4,6,8,9};
		//		for(int i=0;i<a.length;i=i+2) {
		//			System.out.print(a[i]+"  ");
		//		}

		//		for(int i=0;i<a.length;i++) {
		//			if(i%2==0) {
		//				System.out.println(a[i]);
		//			}}

		//largest element in an array
		//		int[] a= {5,3,4,1,8,9,0};
		//		int b=' ';
		//		for(int i=0;i<a.length;i++) {
		//			for(int j=i+1;j<a.length;j++) {
		//				if(a[i]>a[j]) {
		//					b=a[i];
		//				a[i]=a[j];
		//				a[j]=b;
		//				}}
		//		}System.out.println(a[a.length-1]);
		//		System.out.println(a[0]);

		// sum of all the items of the array
//		int[] a= {5,3,4,1,8,9,0};
//		int b=0;
//		for(int i=0;i<a.length;i++) {
//			b=b+a[i];
//		}System.out.println(b);

//right rotate the elements of an array
//		int[] a= {5,3,4,1,8,9,0};
//		int c[]=new int [a.length+1];
//		c[0]=a[a.length-1];
//		for(int i=0;i<a.length;i++) {
//			c[i+1]=a[i];
//			System.out.print(c[i]+" ");
//		}

		//sort in ascending and descending order
		int[] a= {5,3,4,1,8,9,0};
		int b=' ';
				for(int i=0;i<a.length;i++) {
					for(int j=i+1;j<a.length;j++) {
						if(a[i]>a[j]) {
							b=a[i];
						a[i]=a[j];
						a[j]=b;
						}
						}System.out.print(a[i]);
				}





	}}
