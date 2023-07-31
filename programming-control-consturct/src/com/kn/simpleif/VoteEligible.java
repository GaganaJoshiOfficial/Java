package com.kn.simpleif;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a age");
		int age = scan.nextInt() ;
		boolean flag = isVoteEligible(age); 
		if(flag==true) {
			System.out.println("the given age is" +age+" elligible for vote");
		}else {
			System.out.println("the given age is" +age+" not elligible for vote");
		}
		
			

	}

	static boolean isVoteEligible(int age) {
		if(age>=18) {
			return true;
		}else {
		return false;
	}

}
}