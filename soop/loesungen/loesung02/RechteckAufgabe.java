import java.util.Scanner;

public class RechteckAufgabe {
	public static void main(String[] args) {
		int laenge = 0;
		int breite = 0;
		int flaeche = 0;
		int umfang = 0;

		// Eingabe:
		Scanner s;
		s = new Scanner(System.in);

		System.out.print("Länge des Rechtecks: ");
		laenge = s.nextInt();
		System.out.print("Breite des Rechtecks: ");
		breite = s.nextInt();
		
		//Berechnung:
		umfang = 2 * laenge + 2 * breite;
		flaeche = laenge * breite;
		
		// Ausgabe:
		System.out.println("R: " + laenge + " " + breite);
		System.out.println("Umfang: " + umfang);
		System.out.println("Fläche: " + flaeche);
	}
}
