
import java.util.Scanner;

public class StringJoin {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a name");
		String firstname = scan.next();
		String middlename = scan.next();
	    String lastname = scan.next();
	    String fullname = joinString( firstname, middlename,lastname);
	    System.out.println("the full name=" + fullname);
	}
	    
	public static String joinString(String firstname,String middlename,String lastname) {
	String name=(firstname+middlename+lastname);
	return name;
		
		
		
	}

}
