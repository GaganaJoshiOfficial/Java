package IterativeStatements;

import java.util.Scanner;

public class CalculateTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		for(int i = 1;i<10; i++)
		{
			int n = num*i;
			System.out.println("5 + i ="  + num);
		}

	}

}