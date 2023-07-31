package com.kn.ifelse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a year");
		int year = scan.nextInt();
		boolean flag = isLeapYear(year); 
		if(flag==true)
		{
			System.out.println("the given year" +year+"leapyear");
		}
		else {
			System.out.println("the given year" +year+"not leapyear");
		}
	}

	   static boolean isLeapYear(int year) {
		if(year%4==0) 
		{
			System.out.println("is a leapyear");
		}
		if (year%100==0) {
			System.out.println("is century year ");  
		}
		if(year%400==0) {
			System.out.println("is leap and centuray year");
			return true;
		}
			
		else {
			 System.out.println("not leap year");
				return false;
	}

}
}