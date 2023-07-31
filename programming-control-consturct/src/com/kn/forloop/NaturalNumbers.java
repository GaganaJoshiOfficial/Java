package com.kn.forloop;
import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		naturalNum(n);
        
	}

	static void naturalNum(int n) {
		 for (int i = 1; i <= n; i++) {
	            sum += i;
	        }

	        
	        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
				
	}

}
