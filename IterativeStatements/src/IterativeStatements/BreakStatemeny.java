package IterativeStatements;

public class BreakStatemeny {

	public static void main(String[] args) {
		int num = 500;
		for(int i=1; i<=num; i++) {
			if(i%7==0) {
				break;
			}
			else {
				System.out.println(i);
			}
			System.out.println("inside loop");
		}
		     System.out.println("out of loop");
	}

}
