import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a temp in f");
		int f = scan.nextInt();
		System.out.println(f+"F");
		System.out.println("Temperature in Celsius: " + temparatureConverter(f)+"c");
		
	    
	}
	public static  int temparatureConverter(int f) {
		return ((f - 32) * 5)/9;
		


	}

}
