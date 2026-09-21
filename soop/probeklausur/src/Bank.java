import java.util.Arrays;

public class Bank {
	// Array mit allen Konten der Bank
	Konto[] konten;

	/**
	 * Parameterloser Konstruktor
	 */
	public Bank() {
	}

	/**
	 * Konstruktor
	 *
	 * @param konten Array mit den Konten der Bank
	 */
	public Bank(Konto[] konten) {
		this.konten = konten;
	}

	/***********************************
	 * BEGINN des zu bearbeitenden Codes
	 ***********************************/
	/**
	 * Liefert eine String-Repräsentation aller Konten als Liste untereinander:
	 * @formatter:off
	 * [nr]: guthaben
	 * [nr]: guthaben
	 * [nr]: guthaben
	 * usw.
	 * @formatter:on
	 * @return String, der die Liste aller Konten wie oben dargestellt enthält
	 */
	public String toString() {
		// Lösung hier
		return "";
	}

	/**
	 * Liefert das Konto zur übergebenen Nummer.
	 *
	 * @param nummer Nummer des gesuchten Kontos
	 * @return zur Nummer gehörendes Konto Objekt, oder null, falls das Konto nicht
	 *         existiert
	 */
	public Konto getKonto(int nummer) {
		// Lösung hier
		return null;
	}

	/**
	 * Überweist einen Betrag von einem Konto zu einem anderen Konto. Nach der
	 * Überweisung ist das Guthaben auf dem Konto sender um den Betrag niedriger und
	 * auf dem Konto empfänger um den Betrag höher. Die Überweisung kann
	 * fehlschlagen, falls das Konto sender nicht ausreichend gedeckt ist.
	 *
	 * @param sender     Kontonummer des Senders der Überweisung
	 * @param empfaenger Kontonummer des Empfängers der Überweisung
	 * @param betrag     Betrag, der vom Konto des Senders auf das Konto des
	 *                   Empfängers überwiesen wird
	 * @return true, falls die Überweisung erfolgreich war, sonst false
	 */
	public boolean ueberweisen(int sender, int empfaenger, double betrag) {
		// Lösung hier
		return true;
	}

	/**
	 * Ermittelt die Bilanzsumme der Bank: Die Bilanzsumme ist die Summe aller
	 * Guthaben aller Konten.
	 *
	 * @return die Bilanzsumme
	 */
	public double bilanzsumme() {
		// Lösung hier
		return 0.0;
	}

	/**
	 * Führt die Kontenabrechnung am Quartalsende durch: Jedem Konto mit positivem
	 * Guthaben werden 2% des Guthabens zugebucht (Guthabenzinsen), von jedem Konto
	 * mit negativem Guthaben werden 10% des Guthabens abgebucht
	 * (Überziehungsgebühren).
	 */
	public void abrechnen() {
		// Lösung hier
	}

	/**
	 * Liefert alle Konten, bei denen das Guthaben negativ UND mehr als die Hälfte
	 * des Dispokredits ausgeschöpft ist. Anmerkung: Der Dispokredit ist im Konto
	 * als positiver Betrag gespeichert.
	 *
	 * @return Array mit den Risikokonten
	 */
	public Konto[] risikoKonten() {
		// Lösung hier
		return null;
	}

	/***********************************
	 * ENDE des zu bearbeitenden Codes
	 ***********************************/
	// Verwenden Sie die Methode main für Ihre Tests, fügen Sie ggf.
	// weitere Konten und Tests hinzu
	public static void main(String[] args) {
		// fünf Konten für die Tests
		Konto[] k = { new Konto(), new Konto(2000, 500), new Konto(100, 0), new Konto(-200, 1000),
				new Konto(1000, 500) };
		// Bank initialisieren
		Bank b = new Bank(k);
		// Sollte die fünf Konten untereinander ausgeben, erfordert toString
		System.out.println(b);
		// Ausgabe:
		// [ 1]: 0,00
		// [ 2]: 2000,00
		// [ 3]: 100,00
		// [ 4]: -200,00
		// [ 5]: 1000,00
		// Sollte das dritte Konto (Guthaben 100) ausgeben
		int kontoDrei = b.konten[2].getNummer();
		System.out.println(b.getKonto(kontoDrei));
		// Sollte true ausgeben:
		int kontoVier = b.konten[3].getNummer();
		int kontoZwei = b.konten[1].getNummer();
		System.out.println(b.ueberweisen(kontoVier, kontoZwei, 350));
		System.out.println();
		// Liste wie oben, Konto 2: 2350 --- Konto 4: -550:
		System.out.println(b);
		// sollte 2900 ausgeben:
		System.out.println(b.bilanzsumme());
		System.out.println();
		// Sollte 1300 ausgeben:
		System.out.println(b.getKonto(kontoDrei).zubuchen(1200));
		System.out.println();
		b.abrechnen();
		// Liste wie oben
		// Erwartete Guthaben: 0 --- 2397 --- 1326 --- -605 --- 1020
		System.out.println(b);
		// sollte 4138 ausgeben:
		System.out.println(b.bilanzsumme());
		System.out.println();
		// Sollte das Konto 4 in zusätzlichen [] ausgeben:
		System.out.println(Arrays.toString(b.risikoKonten()));
		// Sollte null ausgeben:
		System.out.println(b.getKonto(507));
	}
}
