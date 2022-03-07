package com.inheritance;

public class testing {

	public static void main(String[] args) {
		
		classC obj = new classC();
		obj.admin();
		obj.exam();
		obj.place();
//		start();
		obj.exp();
		obj.stop();
		obj.cls();
		obj.bunk();
		obj.breaks();
		obj.marks(10, 'a');
		obj.admin();
		
		System.out.println(obj.clg);
		System.out.println(obj.dep);
		System.out.println(obj.univ);
		
		System.out.println(obj.teach);
		System.out.println(obj.subj);
		System.out.println(obj.periods);
		
		System.out.println(obj.num);
		System.out.println(obj.sec);
		System.out.println(obj.stud);

		System.out.println(obj instanceof classC);
		

	}

}
