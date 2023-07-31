package com.kn.forloop;

public class SquareNumber {

	public static void main(String[] args) {
		int n=10;
		squareNum(n);
		
			}

	static void squareNum(int n) {
		for(int i=1;i<=n;i++ ) {
			int square=i*i;
			System.out.println("square of " +i+ "=" +square);
		}
				
	}

}
