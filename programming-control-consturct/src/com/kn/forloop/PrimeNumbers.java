package com.kn.forloop;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num=6,range=1000,count=0;
		
		for(int j=2;j<=range;j++) {
		
		
			
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				{
			       count++;
				}
				if(count==2) {
					System.out.println(j);
					
					
				
				}
			
			}
			
		}

	

	}
}


