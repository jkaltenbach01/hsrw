

public class Quersumme {

	/**
	 * Berechnet die Quersumme einer Zahl
	 * 
	 * @param n
	 *            Eingabe
	 * @return Quersumme von n
	 */
	public static int quersumme(int n) {
		int quersumme = 0;
		
		while (n != 0) {
			// letzte Ziffer addieren
			quersumme = quersumme + n % 10;

			// letzte Ziffer wegwerfen
			n = n / 10;
		}
		
		return quersumme;
	}

	public static void main(String[] args) {
		System.out.println(quersumme(247));
	}
}