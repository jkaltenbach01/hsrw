import java.util.ArrayList;

public class Koerper {
	public String farbe;
	public Punkt koordinate;
	public static boolean DEMO = false;
	public ArrayList<Kante> kanten = new ArrayList<Kante>();

	public Koerper(String f, double x, double y, double z) {
		log("Koerper(double, double, double, String)");
		this.farbe = f;
		this.koordinate = new Punkt(x, y, z);
	}

	public Koerper() {
		this("schwarz", 0, 0, 0);
		log("Koerper()");
	}

	public double volumen() {
		log("volumen()");
		return (0.0);
	}

	public double flaeche() {
		log("flaeche()");
		return (0.0);
	}

	public double abstand(Koerper k) {
		log("abstand(Koerper)");
		return this.koordinate.abstand(k.koordinate);
	}

	@Override
	public String toString() {
		log("toString()");
		String r = "Körper@" + this.koordinate.toString() + ", Farbe: " + this.farbe;
		for (Kante k : kanten) {
			r += k + "\n";
		}
		return r;
	}

	public void addKante(Kante k) {
		this.kanten.add(k);
	}

	public void addKante(double ax, double ay, double az, double ex, double ey, double ez) {
		this.addKante(new Kante(ax, ay, az, ex, ey, ez));
	}

	protected void log(String methodName) {
		if (DEMO) {
			System.out.println("Klasse: " + this.getClass().getSimpleName() + " - Methode: " + methodName);
		}
	}
}
