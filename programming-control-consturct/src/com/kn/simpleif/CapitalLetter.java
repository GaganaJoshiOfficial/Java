package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a char");
		char ch = scan.next().charAt(0);
		boolean flag = isCapitalLetter(ch); 
		if(flag==true) {
			System.out.println("the given char " +ch+" is captial letter");
		}else {
			System.out.println("the given char " +ch+" is not captial letter");
		}
	}

	static boolean isCapitalLetter(char ch) {
		if(ch>='A' && ch<='Z') {
			return true;
		}else {
			return false;
		}
			}

}
