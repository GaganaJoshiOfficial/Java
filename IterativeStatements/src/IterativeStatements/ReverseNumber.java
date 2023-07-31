package IterativeStatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int r;
		System.out.println("reversed number");
		while(num>0){
			r = num%10;
		    System.out.print(r);
		    num = num/10;
		    
			
		}

		

	}

}
