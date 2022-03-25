package com.assign4;

public class Assignment1 {
	protected int studentId;
	protected char StudentType;
	protected String studentName;
	protected double feesPerMonth;
	public Assignment1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assignment1(int studentId, char studentType, String studentName, double feesPerMonth) {
		super();
		this.studentId = studentId;
		StudentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return StudentType;
	}
	public void setStudentType(char studentType) {
		StudentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	@Override
	public String toString() {
		return "Assignment1 [studentId=" + studentId + ", StudentType=" + StudentType + ", studentName=" + studentName
				+ ", feesPerMonth=" + feesPerMonth + "]";
	}
	public void displayStudentDetails() {
		System.out.println(studentId+" "+studentName+" "+StudentType+" "+feesPerMonth);
	}
	
}
