

import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {
      // Variable s vom Typ Scanner deklarieren
      // Festlegen, dass s von der Konsole einlesen soll 
		Scanner s = new Scanner(System.in);

      // Vaiablen deklarieren um Eingabe zu speichern
		System.out.print("Länge: ");
		int laenge = s.nextInt();

		System.out.print("Breite: ");
		int breite = s.nextInt();

		System.out.println();

      // Zeichnen des Rechtecks
		for (int i = 0; i < breite; i++) {
			for (int j = 0; j < laenge; j++) {
				if ((i == 0) || (i == (breite - 1))) {
					System.out.print("*");
				} else {
					if ((j == 0) || (j == (laenge - 1))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
