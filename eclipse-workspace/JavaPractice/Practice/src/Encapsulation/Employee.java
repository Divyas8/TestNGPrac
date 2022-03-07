package Encapsulation;

public class Employee {
	
			private String EmpName;
			private String EmpID;
			private String EmpDOB;
			private String EmpSal;
			private String EmpPhno;
			private String EmpEID;
			
		
			public int EmpNameL= 10;
			public int EmpIDL= 10 ;
			public int EmpDOBL=11;
			public int EmpSalL = 11;
			public int EmpEIDL= 30;
			public int EmpPhnoL= 10;
			
			
			public String getEmpName() {
				return EmpName;
			}
			public void setEmpName(String empName) {
				EmpName = empName;
			}
			public String getEmpID() {
				return EmpID;
			}
			public void setEmpID(String empID) {
				EmpID = empID;
			}
			public String getEmpDOB() {
				return EmpDOB;
			}
			public void setEmpDOB(String empDOB) {
				EmpDOB = empDOB;
			}
			public String getEmpSal() {
				return EmpSal;
			}
			public void setEmpSal(String empSal) {
				EmpSal = empSal;
			}
			public String getEmpPhno() {
				return EmpPhno;
			}
			public void setEmpPhno(String empPhno) {
				EmpPhno = empPhno;
			}
			public String getEmpEID() {
				return EmpEID;
			}
			public void setEmpEID(String empEID) {
				EmpEID = empEID;
			}
			

}
