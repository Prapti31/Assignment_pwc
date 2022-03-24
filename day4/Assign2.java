package com.day4;
import java.util.*;
public class Assign2 {
	public static void main(String[] args) {
		int[][] d1=new int[2][3];
		int[][] d2=new int[2][3];
		int[][] sum=new int[2][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first double dimension array elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				d1[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				d2[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j]=d1[i][j]+d2[i][j];
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
