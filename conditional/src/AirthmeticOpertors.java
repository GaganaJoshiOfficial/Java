import java.util.Scanner;

public class AirthmeticOpertors {

	public static void main(String[] args) {
		System.out.println("enter a 2 numbers");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char c = scan.next().charAt(0);
		switch(c) {
		case '+':
			System.out.println("Sum " +(num1+num2));
		case '-':
			System.out.println("differnce of given 2 number " +(num1-num2));
			subtractNumbers(num1 , num2);
			break;
		case '*':
			System.out.println("product" + (num1+num2));	
		case '/':
			System.out.println("quotient" + (num1/num2));
		case '%':
			System.out.println("remainder" + (num1%num2));}	}
	public static int AddNumbers(int num1 , int num2)
	{
		return num1+num2;
	}
	public static int subtractNumbers(int num1 , int num2)
	{
		return num1-num2;
	}
		
		public static int multiplyNumbers(int num1, int num2)
		{
			
			return num1*num2;
		}
		public static int divideNumbers(int num1, int num2)
		{
			
			return num1/num2;
		}
		public static int findRemainder(int num1, int num2)
		{
			
			return num1%num2;
		}
	
	
	
	
			
}



