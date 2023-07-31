package com.kn.ifelse;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a marks");
		int num = scan.nextInt() ;
		boolean flag = isPass(num); 
		if(flag==true) {
			System.out.println("the given number" +num+" is pass");
		}else {
			System.out.println("the given number" +num+" is fail");
		}
		
	}

	 static boolean isPass(int num) {
		 if(num>50) {
			 return true;
		 }else {
				return false;
	}

}
}