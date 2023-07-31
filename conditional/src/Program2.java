import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a char");
		 char c = scan.next().charAt(0);
		 if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
		 {
			 System.out.println("the given char is Vowel") ; 
		 }
		 else
		 {
			 System.out.println("the given char is Consonant");
		 }
		 
			 

	}

}
