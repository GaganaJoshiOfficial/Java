package IterativeStatements;

public class Fabinacci {

	public static void main(String[] args) {

	
		int num=9,nextNumber=0;
		int firstNumber=0,secondNumber=1;
		System.out.print(firstNumber + "   " + secondNumber);
		for(int i=3; i<=num; i++)
		{
			nextNumber=firstNumber+secondNumber;
			System.out.print(nextNumber+ " ");
			firstNumber=secondNumber;
			secondNumber=nextNumber;
		}
	}

}
