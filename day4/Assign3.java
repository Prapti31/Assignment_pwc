package com.day4;

public class Assign3 {
	public static void main(String[] args) {
		String s="Delvin";
		String[][] arr= {{"Tony","Java","c","c++"},{"Thomas","Java","Unix",""},{"Dinil","Linux","Oracle",""},{"Delvin","RDBMS","c#","Oracle"}};
		for(int i=0;i<arr.length;i++) {
			if((arr[i][0].toString()).equals(s)) {
				System.out.print(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]+" "+arr[i][3]);
			}
		}
		
	}
}
