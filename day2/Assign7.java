package com.day2;

public class Assign7 {
	protected int StudentId;
	protected String StudentType;
	
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentType() {
		return StudentType;
	}
	public void setStudentType(String studentType) {
		this.StudentType = studentType;
	}
	@Override
	public String toString() {
		return "Assign7 [StudentId=" + StudentId + ", studentType=" + StudentType + "]";
	}
	
	
}
