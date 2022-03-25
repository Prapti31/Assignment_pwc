package com.assign4;

public class StudentMain {
	public static void main(String[] args) {
		Hostelite hstl=new Hostelite(101,'D',"Prapti",400000,"Ladies Hstl",402);
		System.out.println(hstl.getFeesPerMonth());
		System.out.println(hstl.getHostelName()+" "+hstl.getRoomNumber()+" "+hstl.getStudentName()+" "+hstl.getFeesPerMonth());
		
	}
}
