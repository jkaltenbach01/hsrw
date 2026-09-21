

import java.util.Scanner;

public class KlausurNoten
{

   public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Anzahl der Studenten: ");
		int n = scan.nextInt();
		
		int[] punkte = new int[n];
		System.out.print("Punktzahlen: ");
		for (int i = 0; i < punkte.length; i++) {
			punkte[i] = scan.nextInt();
		}
		
		double summe = 0.0;
		for (int i = 0; i < punkte.length; i++) {
			int note = 0;
			if (punkte[i] < 50) {
				note = 5;
			} else if (punkte[i] < 60) {
				note = 4;
			} else if (punkte[i] < 75) {
				note = 3;
			} else if (punkte[i] < 90) {
				note = 2;
			} else {
				note = 1;
			}
			
			summe = summe + note;
			
			System.out.println("Student " + (i + 1) + " : " + punkte[i] + " Punkte Note " + note);
		}
		System.out.println("Durchschnittsnote: " + (summe / punkte.length));
	}
}
