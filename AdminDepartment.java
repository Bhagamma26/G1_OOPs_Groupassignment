package com.greatlearning.depts;

public class AdminDepartment extends SuperClass {
	
	   

	  public void departmentName(){
		   System.out.println("Welcome to Admin department");
		   
	   }
		public void getTodaysWork(){
			System.out.println("Complete your Documents submission");
		}
		public void getWorkDeadline() {
			System.out.println("Complete by EOD");
			super.isTodayAHoliday();
		}

}
