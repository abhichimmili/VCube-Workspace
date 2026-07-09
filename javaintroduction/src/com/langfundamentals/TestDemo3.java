package com.langfundamentals;

//3.Method with return type and without arguments
class Employee {
	int eid;
	String ename;
	int age;
	String city;
	Long phn;
}

public class TestDemo3 {
	
	static Employee getEmployee(){
		Employee e= new Employee();
		e.eid=101;
		e.ename="Abhi";
		e.age=21;
		e.city="Nellore";
		e.phn=9087654321L;
		return e;
	}
	public static void main(String[] args) {
		
		Employee emp = getEmployee();
		System.out.println("Employee Id : "+emp.eid+", Employee Name : "+emp.ename+", Employee Age : "+emp.age+ 
				", Employee City : "+emp.city+", Employee Mobile : "+emp.phn);

	}

}

