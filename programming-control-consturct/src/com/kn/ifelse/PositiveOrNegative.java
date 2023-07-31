package com.kn.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
        boolean flag = isPositiveOrNegative(num);
        if(flag==true) {
        	System.out.println("the given number" +num+" positive");
        }else {
        	System.out.println("the given number" +num+" negative");
        }
	}

	private static boolean isPositiveOrNegative(int num) {
		if(num>=0) {
			return true;
		}
		else {
			
		return false;
	}

	 }


	}


