import java.util.Scanner;

public class Aufgabe7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double summe = 0;
		
		System.out.println("Zahl n: ");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			summe = summe + (1.0 / (2 * i));
			
		}
		
		System.out.println("Summe = "+ summe);

	}

}
