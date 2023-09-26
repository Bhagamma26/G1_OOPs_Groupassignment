package com.greatlearning.depts;

public class HrDepartment extends SuperClass {

	 public void departmentName(){
		   System.out.println("Welcome to Hr department");
	   }
		public void getTodaysWork(){
			System.out.println("Fill todays timesheet and mark your attendance");
		}
		public void getWorkDeadline() {
			System.out.println("Complete by EOD");
		}
	    public void doActivity() {
	    	System.out.println("team lunch");
	    	super.isTodayAHoliday();
	    }

}
