import java.util.Scanner;

public class Vibgyor {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a alphabet");
		 char c = scan.next().charAt(0);
		 switch (c) {
		 case 'v' : 
			 System.out.println("violet");
			 break;
		 case 'i' :
			 System.out.println("indigo");
			 break;
		 case 'b':
			 System.out.println("blue");
			 break;
		 case 'g' :
			 System.out.println("green");
			 break;
		 case 'y':
			 System.out.println("yellow");
			 break;
		 case 'o':
			 System.out.println("orange");
			 break;
		 case 'r':
			 System.out.println("red");
			 break;
		     default:
			System.out.println("invalid input");
			
			 	 	 	 	 	 	 
		 }
		 System.out.println("the end");
		 
		
	}

}
