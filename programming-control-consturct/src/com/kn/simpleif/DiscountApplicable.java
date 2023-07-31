package com.kn.simpleif;

import java.util.Scanner;

public class DiscountApplicable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a amount");
		int price = scan.nextInt() ;
		boolean flag = isDiscountApplicable(price); 
		if(flag==true) {
			System.out.println("the given amount is " +price+" Discount is Applicable");
		}else {
			System.out.println("the given amount" +price+" Discount is not Applicable");
		}
		
			}

	private static boolean isDiscountApplicable(int price) {
		if(price>100) {
			return true;
		}else {
		return false;
	}

}
}