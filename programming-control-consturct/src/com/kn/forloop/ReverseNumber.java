package com.kn.forloop;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		
		int n;
		System.out.println("reversed number");
		for(int i=1; i<=num; i++){
			n = num%10;
		    System.out.print(n);
		    num = num/10;
		    
		    
			
		}

		

	}



	}


