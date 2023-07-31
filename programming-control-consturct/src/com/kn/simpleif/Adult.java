package com.kn.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a age");
		int num = scan.nextInt();
        boolean flag = isAdult(num);
        if(flag==true) {
        	System.out.println("the given age" +num+" Adult");
        }else {
        	System.out.println("the given age" +num+" Not Adult");
        }
	}

	 static boolean isAdult(int num) {
		if(num>21) {
			return true;
		}else {
		return false;
	}

}
}