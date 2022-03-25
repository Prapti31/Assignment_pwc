package com.day5;

public class Student {
	private int StudentId;
	private char StudentType;
	private String StudentName;
	private String residentialStatus;
	private long feesPerMonth;
	private long HostelFees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, char studentType, String studentName, String residentialStatus, long feesPerMonth,
			long hostelFees) {
		super();
		StudentId = studentId;
		StudentType = studentType;
		StudentName = studentName;
		this.residentialStatus = residentialStatus;
		this.feesPerMonth = feesPerMonth;
		HostelFees = hostelFees;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public char getStudentType() {
		return StudentType;
	}
	public void setStudentType(char studentType) {
		StudentType = studentType;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public long getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	public long getHostelFees() {
		return HostelFees;
	}
	public void setHostelFees(long hostelFees) {
		HostelFees = hostelFees;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentType=" + StudentType + ", StudentName=" + StudentName
				+ ", residentialStatus=" + residentialStatus + ", feesPerMonth=" + feesPerMonth + ", HostelFees="
				+ HostelFees + "]";
	}
	
	public long calculateFees(long feesPerMonth) {
		long SemesterFees=feesPerMonth*6;
		return SemesterFees;
	}
	public long calculateFees(long feesPerMonth,long HostelFees) {
		feesPerMonth=feesPerMonth+HostelFees;
		return feesPerMonth;
	}
}
