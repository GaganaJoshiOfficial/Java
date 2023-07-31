import java.util.Scanner;

public class CurrencyConvert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a rs");
		int rs = scan.nextInt();
		System.out.println("indian rs in $" +  dollar(rs));
		System.out.println("indian rs in pound " + pound(rs));
	}
	public static double dollar(int rs){
		return rs*0.012;
	}
	public static double pound(int rs){
       return rs*0.0094;
	}
}


