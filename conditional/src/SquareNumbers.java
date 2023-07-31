import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int squarenum = SquareNumber(num);
		System.out.println("result" + squarenum);
		
	}
		

		public static int SquareNumber(int num) {
			
			
			return num*num;
		}
	}


