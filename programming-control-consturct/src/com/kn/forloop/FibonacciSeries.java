package com.kn.forloop;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=5,nextNumber=0;
		int firstNumber=0,secondNumber=1;
		System.out.print(firstNumber + "   " + secondNumber);
		findNextNum(firstNumber,secondNumber);
		
	}

	static void findNextNum(int firstNumber, int secondNumber) {
		int num=5,nextNumber=0;
		for(int i=1; i<=num; i++)
		{
			nextNumber=firstNumber+secondNumber;
			System.out.print(nextNumber+ " ");
			firstNumber=secondNumber;
			secondNumber=nextNumber;
		}
		
		
	}




	}


