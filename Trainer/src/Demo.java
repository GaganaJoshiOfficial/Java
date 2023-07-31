
import java.util.Scanner;
public class Demo {
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("User! please enter an integer");
	int a = scan.nextInt();
	System.out.println("User! please enter another integer");
	int b = scan.nextInt();
	Calculator c = new Calculator();
	c.add(a,b);
	c.sub(a,b);
	c.mul(a,b);
	c.div(a,b);
	c.mod(a,b);
	
	
	
  }
     
	

}
