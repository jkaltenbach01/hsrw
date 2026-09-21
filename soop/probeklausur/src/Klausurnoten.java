public class Klausurnoten {
	/**
	 * Die Methode erhält eine ganzzahlige Punktzahl im Intervall [0, 100] und soll
	 * die Klausurnote entsprechend der Tabelle zurückgeben. Falls eine Punktzahl
	 * übergeben wird, die nicht im Intervall [0, 100] liegt, soll -1 zurückgegeben
	 * werden.
	 *
	 * Verwenden Sie die folgenden Parameter und Rückgabewerte:
	 *
	 * Punkte Note 0 - 49 5 50 - 54 4 55 - 69 3 70 - 84 2 85 - 100 1
	 *
	 * @param punkte Punktzahl
	 * @return Note entsprechend der Werte in der Tabelle
	 */

	public static int berechneNote(int punkte) {
		// Lösung hier
	}

	// Verwenden Sie die Methode main für Ihre Tests, fügen
	// Sie ggf. weitere Tests hinzu
	public static void main(String[] args) {
		System.out.println(berechneNote(72)); // sollte 2 ausgeben
		System.out.println(berechneNote(107)); // sollte -1 ausgeben
	}
}