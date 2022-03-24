package com.day3;

public class Assign7 {
	public static void main(String[] args) {
		int sId=25;
		Assign7 val=new Assign7();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The Sid are"+sId);
	}
	public void passTheValueMethod(int sId) {
		sId=10;
		System.out.println("The sId are"+sId);
	}
}
