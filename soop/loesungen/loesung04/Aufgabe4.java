

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
      // Variable s vom Typ Scanner deklarieren
      // Festlegen, dass s von der Konsole einlesen soll 
		Scanner scanner = new Scanner(System.in);

      // ganzzahlige Variablen untere Grenze und obereGernze deklarieren
		int untereGrenze;
		int obereGrenze;

		// Grenzen abfragen
		System.out.print("Untere Grenze: ");
		untereGrenze = scanner.nextInt();
		System.out.print("Obere Grenze: ");
		obereGrenze = scanner.nextInt();
		
		// Pruefen, ob möglich
		if (untereGrenze < obereGrenze) {
			// Reihe ausgaben
			System.out.print("Die Reihe lautet:");
			while (untereGrenze <= obereGrenze) {
				if (((untereGrenze % 3 == 0) || (untereGrenze % 4 == 0)) && !((untereGrenze % 3 == 0) && (untereGrenze % 4 == 0))) {
					System.out.print(" " + untereGrenze);
				}
				untereGrenze++;
			}
		} else {
			// nicht möglich
			System.out.print("Ihre untere Grenze ist größer als die obere Grenze!");
		}
	}

}
