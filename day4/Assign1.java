package com.day4;

public class Assign1 {
	
		int StudentId;
		String StuName;
		static int StudentCount=0;
		public static int getStudentCount() {
			return StudentCount;
		}
		public Assign1() {
			Assign1.StudentCount++;
			this.StudentId=Assign1.StudentCount;
		}
		static {
			StudentCount=10;
		}
		public static void main(String[] args) {
			Assign1 ass=new Assign1();
			System.out.println(ass.getStudentCount());
		}
		
}
