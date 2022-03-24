package com.day3;

public class Assign6 {
	String name;

	Assign6(String name) {
		super();
		this.name = name;
	}
	Assign6(){
		this("student");
	}
	public static void main(String[] args) {
		Assign6 us1=new Assign6("Faculty");
		Assign6 us2=new Assign6();
		System.out.println(us1);
		System.out.println(us2);
	}
}
