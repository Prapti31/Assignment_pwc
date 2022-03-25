package com.day5;

public class Assign7 {
	public static void main(String[] args) {
		Student student=new Student();
		student.setStudentId(Integer.parseInt(args[0]));
		student.setStudentType((args[1]).charAt(0));
		student.setStudentName(args[2]);
		student.setResidentialStatus(args[3]);
		student.setFeesPerMonth(Long.parseLong(args[4]));
		student.setHostelFees(Long.parseLong(args[5]));
		if(student.getStudentType()=='D') {
			System.out.println(student.calculateFees(student.getFeesPerMonth()));
		}
		else {
			System.out.println(student.calculateFees(student.getFeesPerMonth(),student.getHostelFees()));
		}
		//System.out.println(student.toString());
		
	}
}
