package com.kn.forloop;

import java.util.Scanner;

public class CalculateTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int n=5;
	
		for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));


	}

	}
}
