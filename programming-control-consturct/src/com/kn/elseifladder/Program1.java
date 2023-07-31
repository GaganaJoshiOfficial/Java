package com.kn.elseifladder;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt() ;
		int positiveornegative = positiveornegative(num);
		
		
		

	}

	 static int positiveornegative(int num) {
		if(num>0) {
			System.out.println("the number is positive");
		}
	 else if(num<0) {
		 System.out.println("the  number is negative");
			
		}
	 else {
		 System.out.println("the number is zero");
	 }
		
		
		return 0;
	}

}
