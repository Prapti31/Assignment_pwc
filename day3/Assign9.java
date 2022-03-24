package com.day3;

public class Assign9 {
	int studentId=550;
	int studentType;
	String studentName;
	public Assign9() {
		this.studentId++;
		
		}
	public Assign9(char sType,String fname,String lname) {
		studentType=sType;
		studentName=fname+lname;
	}
	public void displayDetails() {
		System.out.println(studentType+" "+studentName+" "+studentId);
	}
	public static void main(String[] args) {
		Assign9 obj=new Assign9('D',"Bony","Thomas");
		obj.displayDetails();
		Assign9 obj1=new Assign9('H',"Dinil","Bose");
		obj1.displayDetails();
	}
}
	

