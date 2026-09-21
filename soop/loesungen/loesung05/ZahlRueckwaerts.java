

public class ZahlRueckwaerts {

	/**
	 * Liefert die Eingabe in umgekehrter Folge der Ziffern
	 * 
	 * @param n
	 *            Eingabe
	 * @return Zahl rückwärts
	 */
	public static int zahlRueckwaerts(int n) {
		int ergebnis = 0;
		
		while (n != 0) {
			// verzehnfachen und letzte Ziffer addieren (Horner Schma)
			ergebnis = ergebnis * 10 + n % 10;
			// letzte Ziffer wegwerfen
			n = n / 10;
		}
		
		return ergebnis;
	}

	public static void main(String[] args) {
		System.out.println(zahlRueckwaerts(120470));
	}

}
