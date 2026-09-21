
public class Kugel extends Koerper {
	private double radius;

	public Kugel(String f, double x, double y, double z, double r) {
		super(f, x, y, z);
		log("Kugel(double, double, double, String, double)");
		this.radius = r;

		this.addKante(new Kante(new Punkt(x - r, y, z), new Punkt(x + r, y, z)));
		this.addKante(new Kante(new Punkt(x, y - r, z), new Punkt(x, y + r, z)));
		this.addKante(new Kante(new Punkt(x, y, z - r), new Punkt(x, y, z + r)));
	}

	public Kugel() {
		super();
		log("Kugel()");
		this.radius = 0;
	}

	public void setRadius(double r) {
		log("setRadius(double)");
		this.radius = r;
	}

	@Override
	public double volumen() {
		log("volumen()");
		return (4 / 3 * Math.PI * Math.pow(this.radius, 3));
	}

	@Override
	public double flaeche() {
		log("flaeche()");
		return (4 * Math.PI * Math.pow(this.radius, 2));
	}

	// Methode überladen, wenn Kugel als Parameter wird diese Methode aufgerufen
	// Wenn Koeper als Parameter, wird die Methode aus Koerper aufgerufen
	public double abstand(Kugel k) {
		log("abstand(Kugel)");
		if (this.koordinate.abstand(k.koordinate) > this.radius + k.radius) {
			// System.out.println("Nebeneinander");
			return this.koordinate.abstand(k.koordinate) - this.radius - k.radius;
		} else if (this.koordinate.abstand(k.koordinate) < this.radius - k.radius) {
			// System.out.println("Ineinander");
			return Math.abs(this.radius - k.radius) - this.koordinate.abstand(k.koordinate);
		} else {
			// System.out.println("Schneiden/Berühren");
			return .0;
		}
	}

	@Override
	public String toString() {
		log("toString()");
		return "Kugel@" + this.koordinate + ", Farbe: " + this.farbe + ", Radius: " + this.radius;
	}
}
