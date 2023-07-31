

import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			System.out.println("enter a number");
			int num = scan.nextInt();
			int cubenum = cubeNumber(num);
			System.out.println("the cube of given number" + cubenum);
			
		}
			

			public static int cubeNumber(int num) {
				
				
				return num*num*num;
			}
		


	}


