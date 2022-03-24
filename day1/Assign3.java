package com.day1;

public class Assign3 {
	public static void main(String[] args) {
		boolean bool1=false;
		boolean bool2=true;
		boolean bool3=true;
		if(bool2 ||(bool1 &&(bool2=false))) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
		System.out.print("bool2 value:"+bool2);
		
	
		}
	}

