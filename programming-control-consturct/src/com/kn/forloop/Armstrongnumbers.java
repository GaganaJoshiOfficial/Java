package com.kn.forloop;

public class Armstrongnumbers {

	public static void main(String[] args) {
		int num=153;
		int sum=0,temp=0,r;
		for(int i=1;i<=num; i++) {
			r=num %10;
			r=r*r*r;
			sum=sum+r;
			num=num/10;
			
			
		}
		if(temp==sum) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("not amstrong");
		}
	}

}
