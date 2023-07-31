package com.kn.forloop;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		double seriessum = findSeriessum(num);
		System.out.println(seriessum);
		
	}


	 static double findSeriessum(int num) {
		 double sum=0.0;
		 
			 for(double i=1;i<=num;i++)
			 {
				 sum=sum+1/i;
			 }
		 
		
		return sum;
	}

}
