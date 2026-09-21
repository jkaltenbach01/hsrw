import java.util.Scanner;

public class CharAutomat {

	public static boolean automat(char[] eingabe) {

		// Zustandsübergangstabelle (delta):
		// Zeilen: Eingabezeichen (a, b, c, e)
		// Spalten: aktueller Zustand (0 bis 9)
		// Eintrag delta[zeichenIndex][zustand] = neuer Zustand
		// 9 ist der Fehlerzustand (nicht akzeptiert)
		int[][] delta = {
			//  0  1  2  3  4  5  6  7  8  9   ← aktueller Zustand
			{ 1, 9, 3, 9, 3, 9, 3, 9, 9, 9 }, // Eingabezeichen 'a' (Vokal)
			{ 4, 2, 9, 2, 8, 8, 9, 9, 5, 9 }, // 'b' (Konsonant)
			{ 6, 2, 9, 2, 9, 9, 8, 8, 7, 9 }, // 'c' (Konsonant)
			{ 1, 9, 3, 9, 3, 9, 3, 9, 9, 9 }  // 'e' (Vokal)
		};

		// Startzustand ist 0
		int zustand = 0;

		// Eingabezeichen nacheinander verarbeiten
		for (int i = 0; i < eingabe.length; i++) {
			char c = eingabe[i]; // aktuelles Zeichen

			// Zeichen in Index für delta-Tabelle umwandeln:
			// 'a' → 0, 'b' → 1, 'c' → 2, 'e' → 3
			// Hinweis: 'd' ist nicht erlaubt, daher wird 'e' speziell behandelt
			zustand = (c != 'e') 
				? delta[c - 'a'][zustand]       // für 'a', 'b', 'c'
				: delta[c - 'a' - 1][zustand];  // für 'e' → Index 3
		}

		// Akzeptierte Endzustände: 2, 3, 8
		// Diese repräsentieren gültige Endmuster:
		// - 2: alternierende Konsonant-Vokal-Folge
		// - 3: endend mit Vokal nach Konsonant
		// - 8: gültige Doppelkonsonantenfolge
		if (zustand == 2 || zustand == 3 || zustand == 8) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		// Eingabeaufforderung
		Scanner scan = new Scanner(System.in);
		System.out.print("Eingabe (Wort aus a, b, c, e): ");
		String sEingabe = scan.nextLine();

		// Eingabe in char-Array umwandeln
		char[] cEingabe = sEingabe.toCharArray();

		// Ergebnis des Automaten ausgeben
		System.out.println(automat(cEingabe));
	}
}