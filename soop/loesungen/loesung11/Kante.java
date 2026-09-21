
public class Kante {

	private Punkt a;
	private Punkt e;

	public Kante(Punkt a, Punkt e) {
		this.a = a;
		this.e = e;
	}

	public Kante(double ax, double ay, double az, double ex, double ey, double ez) {
		this(new Punkt(ax, ay, az), new Punkt(ex, ey, ez));
	}

	public Kante() {
		this(new Punkt(0, 0, 0), new Punkt(0, 0, 0));
	}

	public Punkt getA() {
		return this.a;
	}

	public void setA(Punkt a) {
		this.a = a;
	}

	public Punkt getE() {
		return this.e;
	}

	public void setE(Punkt e) {
		this.e = e;
	}

	/**
	 * Bewegt die Kante im R3
	 * 
	 * @param dx delta x
	 * @param dy delta y
	 * @param dz delta z
	 */
	public void bewege(double dx, double dy, double dz) {
		this.a.bewege(dx, dy, dz);
		this.e.bewege(dx, dy, dz);
	}

	/**
	 * Berechnet die Länge im R3
	 * 
	 * @return die Länge der Kante
	 */
	public double laenge() {
		return this.a.abstand(this.e);
	}

	/**
	 * Stellt fest, ob diese Kante parallel zum Parameter ist
	 * 
	 * @param k Zweite Kante, gegen die geprüft werden soll.
	 * @return true, falls die Kanten parallel sind, false sonst
	 */
	public boolean istParallel(Kante k) {
		Punkt v1 = this.vektor();
		Punkt v2 = k.vektor();

		// Nullvektor ist immer parallel
		if (this.laenge() == 0.0 || k.laenge() == 0.0) {
			return true;
		}

		double skalar = v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;

		double abscoswinkel = Math.abs(skalar / (this.laenge() * k.laenge()));

		return Math.abs(abscoswinkel - 1.0) < 1E-7;
	}

	/**
	 * Liefert den Richtungsvektor vom Anfangs- zum Endpunkt
	 * 
	 * @return Richtungsvektor
	 */
	public Punkt vektor() {
		return new Punkt(this.e.x - this.a.x, this.e.y - this.a.y, this.e.z - this.a.z);
	}

	@Override
	public String toString() {
		return "(" + this.a + ", " + this.e + ")";
	}
}
