package IterativeStatements;

public class ContinueStatement {

	public static void main(String[] args) {
		int num = 10;
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println( "inside loop");
			
		}
		System.out.println("out of loop");
	}

}
