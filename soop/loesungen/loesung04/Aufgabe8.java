import java.util.Scanner;

public class Aufgabe8 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		double piViertel = 0.0;
		double piAlt = 0.0;
		double pi = 1.0;
		
		double n = 1.0;
		
		System.out.print("Epsilon: ");
		double epsilon = s.nextDouble();
		
		double vorzeichen = 1.0;
		
		while (Math.abs(pi - piAlt) > epsilon) {
			
			piAlt = pi;
			
			piViertel = piViertel + vorzeichen / n ;
			
			vorzeichen = vorzeichen*-1.0;
			
			pi = 4.0 * piViertel;
			
			n = n + 2.0;
		}

		System.out.println("Pi = " + pi);
	}

}
