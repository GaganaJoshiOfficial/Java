package com.kn.forloop;

public class Factorial {

	public static void main(String[] args) {
    int num = 5;
    
    		int ft=factorial(num);
    
		
    System.out.println("facotrial of given number" +num + " ="  +ft);
	}

	 static int factorial(int num) {
		 int fact=1;
		 for(int i=1; i<=num; i++)
			{
		fact=fact*i;
			}
		 return fact;
								
	}
	
	

	}


