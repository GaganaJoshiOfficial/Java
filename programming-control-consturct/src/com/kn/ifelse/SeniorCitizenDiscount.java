package com.kn.ifelse;

import java.util.Scanner;

public class SeniorCitizenDiscount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a age");
		int age = scan.nextInt() ;
		boolean flag = isSeniorCitizenDiscount(age); 
		if(flag==true) {
			System.out.println("the given age is" +age+" person is elligible for Senior Citizen Discount");
		}else {
			System.out.println("the given age is" +age+" person is not elligible for Senior Citizen Discount");
		}
		

	}

	private static boolean isSeniorCitizenDiscount(int age) {
		if(age>=60) {
			return true;
		}else {
				return false;
	}

}
}