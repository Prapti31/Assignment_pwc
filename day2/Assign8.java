package com.day2;

public class Assign8 {
	
		int StudentId;
		char StudentType;
		public Assign8() {
			//super();
			StudentId = 10;
			StudentType = 'F';
		}
		public char getStudentType() {
			return StudentType;
		}
		public int getStudentId() {
			return StudentId;
		}
		public static void main(String[] args) {
			Assign8 obj=new Assign8();
			System.out.print(obj.getStudentType());
			System.out.print(obj.getStudentId());
		}
	
}
