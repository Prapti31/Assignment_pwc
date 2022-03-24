package com.day2;
import java.util.*;
public class Assign6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char grade=sc.nextLine().charAt(0);
		switch(grade) {
		case 'A':
			System.out.println("MARKS between 80-100");
			break;
		case 'B':
			System.out.println("MARKS between 73-79");
			break;
		case 'C':
			System.out.println("MARKS between 65-72");
			break;
		case 'D':
			System.out.println("MARKS between 55-64");
			break;
		case 'E':
			System.out.println("MARKS less than 55");
			break;
		default:
			System.out.print("Invalid");
			
			
			
		}
	}
}
