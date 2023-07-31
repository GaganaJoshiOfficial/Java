package com.kn.forloop;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
					int base=scan.nextInt();
			        int exponent=scan.nextInt();
			        int power=CalculatePower(base ,exponent);
			        System.out.println("powers of given n number" +power);
	}
			        
			        static int CalculatePower(int base ,int exponent)
			        {

			        int power=1;
			        for(int i=1; i<=exponent; i++) {
			        	power=power*base;
			        }
			        
			        
		
			        return power;

	}}

