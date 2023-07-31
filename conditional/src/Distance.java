import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double speed = scan.nextDouble();
        double time = scan.nextDouble();
        double distance = calculateDistance(speed , time);
        System.out.println("Distance" + distance);
	}
        
        public static double calculateDistance(double speed,double time) {
        	
        	return speed*time;
        	
        }
				
	}


