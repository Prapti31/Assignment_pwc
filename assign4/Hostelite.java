package com.assign4;

public class Hostelite extends Assignment1{
	private String hostelName;
	private int roomNumber;
	public Hostelite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hostelite(int studentId, char studentType, String studentName, double feesPerMonth,String HName,int roomNumber) {
		super(studentId, studentType, studentName, feesPerMonth);
		// TODO Auto-generated constructor stub
		this.hostelName=HName;
		this.roomNumber=roomNumber;
	}
	public String getHostelName() {
		return hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void displayStudentDetails() {
		System.out.println(studentName+" "+StudentType+" "+hostelName+" "+roomNumber);
	}
	
}
