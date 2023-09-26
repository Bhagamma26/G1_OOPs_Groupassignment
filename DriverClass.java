package com.greatlearning.app;

import com.greatlearning.depts.AdminDepartment;
import com.greatlearning.depts.HrDepartment;
import com.greatlearning.depts.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		AdminDepartment a1 = new AdminDepartment();
		a1.departmentName();
		a1.getTodaysWork();
		a1.getWorkDeadline();
	    System.out.println("------------------------------");	
		
	    HrDepartment h1 = new HrDepartment();
		h1.departmentName();
		h1.getTodaysWork();
		h1.getWorkDeadline();
		h1.doActivity();
		System.out.println("------------------------------");
		
		TechDepartment t1 = new TechDepartment();
		t1.departmentName();
		t1.getTodaysWork();
		t1.getWorkDeadline();
		t1.getTechStackInformation();

	}


	

}
