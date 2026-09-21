
public class Bruch {

	private int zaehler;
	private int nenner;

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
		this.kuerze();
	}

	public Bruch(int zaehler) {
		this(1, zaehler);
	}

	@Override
	public String toString() {
		return this.zaehler + " / " + this.nenner;
	}

	/**
	 * Addiert den übergebenen Bruch zu diesem Bruch dazu
	 * 
	 * @param b Summand 2
	 */
	public void addiere(Bruch b) {
		Bruch c = Bruch.addiere(this, b);
		this.zaehler = c.zaehler;
		this.nenner = c.nenner;
	}

	/**
	 * Addiert zwei Brüche und liefert das Ergebnis als neuen Bruch zurück
	 * 
	 * @param a Summand 1
	 * @param b Summand 2
	 * @return Summe
	 */
	public static Bruch addiere(Bruch a, Bruch b) {
		Bruch c = new Bruch(a.zaehler * b.nenner + b.zaehler * a.nenner, a.nenner * b.nenner);
		c.kuerze();
		return c;
	}

	/**
	 * Subtrahiert den übergebenen Bruch von diesem Bruch und speichert das Ergebnis
	 * in diesem Bruch.
	 * 
	 * @param b Subtrahend
	 */
	public void subtrahiere(Bruch b) {
		Bruch c = Bruch.subtrahiere(this, b);
		this.zaehler = c.zaehler;
		this.nenner = c.nenner;
	}

	/**
	 * Berechnet die Differenz zweier Brüche. Verwendet die bereits vorhandene
	 * Addition, indem der Subtrahend negiert wird.
	 * 
	 * @param a Minuend
	 * @param b Subtrahend
	 * @return neuer Bruch mit dem Ergebnis der Subtraktion
	 */
	public static Bruch subtrahiere(Bruch a, Bruch b) {
		Bruch c = Bruch.addiere(a, new Bruch(-b.zaehler, b.nenner));
		return c;
	}

	/**
	 * Multipliziert den übergebenen Bruch zu diesem Bruch und speichert das
	 * Ergebnis in diesem Bruch.
	 * 
	 * @param b Faktor 2
	 */
	public void multipliziere(Bruch b) {
		Bruch c = Bruch.multipliziere(this, b);
		this.zaehler = c.zaehler;
		this.nenner = c.nenner;
	}

	/**
	 * Berechnet das Produkt zweier Brüche.
	 * 
	 * @param a Faktor 1
	 * @param b Faktor 2
	 * @return neuer Bruch mit dem Ergebnis der Multiplikation
	 */
	public static Bruch multipliziere(Bruch a, Bruch b) {
		Bruch c = new Bruch(a.zaehler * b.zaehler, a.nenner * b.nenner);
		c.kuerze();
		return c;
	}

	/**
	 * Dividiert diesen Bruch durch den übergebenen Bruch und speichert das Ergebnis
	 * in diesem Bruch.
	 * 
	 * @param b Divisor
	 */
	public void dividiere(Bruch b) {
		Bruch c = Bruch.dividiere(this, b);
		this.zaehler = c.zaehler;
		this.nenner = c.nenner;
	}

	/**
	 * Dividiert zwei Brüche unter Verwendung der Multiplikation mit vertauschtem
	 * Zähler und Nenner des Divisors.
	 * 
	 * @param a Dividend
	 * @param b Divisor
	 * @return neuer Bruch mit dem Ergebnis der Division.
	 */
	public static Bruch dividiere(Bruch a, Bruch b) {
		Bruch c = Bruch.multipliziere(a, new Bruch(b.nenner, b.zaehler));
		return c;
	}

	public double wert() {
		return (double) this.zaehler / this.nenner;
	}

	public void kuerze() {
		int g = Math.abs(ggT(this.zaehler, this.nenner));
		this.zaehler /= g;
		this.nenner /= g;
	}

	private int ggT(int a, int b) {
		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

}
