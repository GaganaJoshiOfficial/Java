package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt() ;
		boolean flag = isPositiveNumber(num); 
		if(flag==true) {
			System.out.println("the given number" +num+" is positive");
		}else {
			System.out.println("the given number" +num+" is negtive");
		}
		
			
		}

	

	 static boolean isPositiveNumber(int num) {
		if(num>0) {
			return true;
		}
		else {
			return false;
		}
			}

}
