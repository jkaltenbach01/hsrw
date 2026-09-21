import java.util.Scanner;

public class Zahlwort {

	public static void main(String[] args) {
		// Variable s vom Typ Scanner deklarieren
		Scanner s;
		// Festlegen, dass s von der Konsole einlesen soll
		s = new Scanner(System.in);

		// Nachricht auf die Konsole ausgeben
		// der Variablen x die Eingabe von der Konsole zuweisen
		System.out.print("Zahl [0..9999]: ");
		int input = s.nextInt();
		
		int tausender = input / 1000;
		int hunderter = (input / 100) % 10;
		int zehner = (input / 10) % 10;
		int einer = input % 10;

		String zahl = "";
			switch (tausender) {
			case 1: zahl = "eintausend"; break;
			case 2:
				zahl = "zweitausend";
				break;
			case 3:
				zahl = "dreitausend";
				break;
			case 4:
				zahl = "viertausend";
				break;
			case 5:
				zahl = "fünftausend";
				break;
			case 6:
				zahl = "sechstausend";
				break;
			case 7:
				zahl = "siebentausend";
				break;
			case 8:
				zahl = "achttausend";
				break;
			case 9:
				zahl = "neuntausend";
				break;
			}

			switch (hunderter) {
			case 1:
				zahl += "einhundert";
				break;
			case 2:
				zahl += "zweihundert";
				break;
			case 3:
				zahl += "dreihundert";
				break;
			case 4:
				zahl += "vierhundert";
				break;
			case 5:
				zahl += "fünfhundert";
				break;
			case 6:
				zahl += "sechshundert";
				break;
			case 7:
				zahl += "siebenhundert";
				break;
			case 8:
				zahl += "achthundert";
				break;
			case 9:
				zahl += "neunhundert";
				break;
			}
		// Wenn input kleiner 10, dann ist der input einstellig
		if (zehner < 2) {
			switch (zehner * 10 + einer) {
			case 1:
				zahl += "eins";
				break;
			case 2:
				zahl += "zwei";
				break;
			case 3:
				zahl += "drei";
				break;
			case 4:
				zahl += "vier";
				break;
			case 5:
				zahl += "fünf";
				break;
			case 6:
				zahl += "sechs";
				break;
			case 7:
				zahl += "sieben";
				break;
			case 8:
				zahl += "acht";
				break;
			case 9:
				zahl += "neun";
				break;
			case 10:
				zahl += "zehn";
				break;
			case 11:
				zahl += "elf";
				break;
			case 12:
				zahl += "zwölf";
				break;
			case 13:
				zahl += "dreizehn";
				break;
			case 14:
				zahl += "vierzehn";
				break;
			case 15:
				zahl += "fünfzehn";
				break;
			case 16:
				zahl += "sechzehn";
				break;
			case 17:
				zahl += "siebzehn";
				break;
			case 18:
				zahl += "achtzehn";
				break;
			case 19:
				zahl += "neunzehn";
				break;
			}
		} else {
			switch (einer) {
			case 1: zahl += "einund";
			break;
			case 2: zahl += "zweiund";
			break;
			case 3: zahl += "dreiund";
			break;
			case 4: zahl += "vierund";
			break;
			case 5: zahl += "fünfund";
			break;
			case 6: zahl += "sechsund";
			break;
			case 7: zahl += "siebenund";
			break;
			case 8: zahl += "achtund";
			break;
			case 9: zahl += "neunund";
			break;
			}
			switch (zehner) {
			case 2:
				zahl += "zwanzig";
				break;
			case 3:
				zahl += "dreißig";
				break;
			case 4:
				zahl += "vierzig";
				break;
			case 5:
				zahl += "fünfzig";
				break;
			case 6:
				zahl += "sechzig";
				break;
			case 7:
				zahl += "siebzig";
				break;
			case 8:
				zahl += "achtzig";
				break;
			case 9:
				zahl += "neunzig";
				break;
			}
		}
		if (input == 0) {
			zahl = "null";
		}
		System.out.println(zahl);
	}
}