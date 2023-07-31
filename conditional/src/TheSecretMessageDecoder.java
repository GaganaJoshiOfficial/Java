import java.util.Scanner;

public class TheSecretMessageDecoder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a char");
		char ch = scan.next().charAt(0);
		System.out.println("the  decode message" + decodeMessage(ch));
	}
		 
		 
		 public static int decodeMessage(char message) {
			 return message;
			 
		 }
	}


