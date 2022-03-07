package Encapsulation;
import java.util.*;

public class EmpDet {
	
	public static void main (String[] args) {
	
	Employee e=new Employee();
	
	e.setEmpName("Divya");
	e.setEmpEID("divya@gmail.com");
	e.setEmpDOB("01-10-1001");
	e.setEmpPhno("123456789");
	e.setEmpSal("1200000"); 
	e.setEmpID("12346");
	
	Testfunc.Func(e.getEmpName(), e.EmpNameL);
	Testfunc.Func(e.getEmpEID(), e.EmpEIDL);
	Testfunc.Func(e.getEmpDOB(), e.EmpDOBL);
	Testfunc.Func(e.getEmpPhno(), e.EmpPhnoL);
	Testfunc.Func(e.getEmpSal(), e.EmpSalL);
	Testfunc.Func(e.getEmpID(), e.EmpIDL);
}}

