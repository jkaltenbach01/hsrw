//import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * 
 * In dieser Klasse folgen wir den Regeln des kaufmaennischen Rundens nach DIN
 * 1333.
 * <p>
 * 1. Ist die Ziffer an der ersten wegfallenden Dezimalstelle eine 0, 1, 2, 3
 * oder 4, dann wird abgerundet.
 * <p>
 * 2. Ist die Ziffer an der ersten wegfallenden Dezimalstelle eine 5, 6, 7, 8
 * oder 9, dann wird aufgerundet.
 * <p>
 * Negative Zahlen werden nach ihrem Betrag, also weg von null, gerundet.
 * <p>
 * Quelle:
 * <p>
 * https://www.billomat.com/lexikon/k/kaufmaennisches-runden/
 * 
 * @author FL
 * @version 1.0
 *
 */

public class Runden {
	public static void main(String[] args) {

		// Zahlen auf jedem System mit "." statt "," einlesen
		// Locale.setDefault(Locale.US);

		// Zahl einlesen
		Scanner sc = new Scanner(System.in);
		System.out.print("Zahl: ");
		double eingabe = sc.nextDouble();

		boolean negativ = false;

		// Überprüfen, ob die Zahl negativ ist und dann mit dem Betrag weiterrechnen.
		// Spater könnte man auf Math.abs() zurückgreifen.
		if (eingabe < 0) {
			negativ = true;
			eingabe *= -1.;
		}

		// Zahl mit 1000 multiplizieren, um die ersten drei Nachkommastellen zu
		// erhalten, anschließend auf Integer casten
		int geschnitten = (int) (eingabe * 1000);

		// Muss gerundet werden? Falls ja: die vorletzte Stelle inkrementieren
		if (geschnitten % 10 >= 5)
			geschnitten += 10;

		// Letzte Stelle abschneiden, da nur zwei Nachkommastellen gefordert sind. Auf
		// double casten und wieder durch 100 teilen, damit das Komma an der korrekten
		// Stelle ist und zum Schluss ausgeben.
		System.out.println("Gerundet: "
				+ (negativ ? (-1. * ((double) (geschnitten / 10) / 100)) : ((double) (geschnitten / 10) / 100)));

		// Nicht vergessen den Scanner zu schließen :)
		sc.close();

	}
}
