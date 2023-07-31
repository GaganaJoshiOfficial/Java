package com.kn.ifelse;

import java.util.Scanner;

public class MultipleNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt() ;
		boolean flag = isMultipleNumber(num); 
		if(flag==true) {
			System.out.println("the given number" +num+" is multiple of 10");
		}else {
			System.out.println("the given number" +num+" is not multiple of 10");
		}
		


	}

	private static boolean isMultipleNumber(int num) {
		if(num%10==0) {
			return true;
		}else {
				return false;
	}

}
}