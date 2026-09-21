
import java.util.ArrayList;

public class Szene {

	public static boolean DEMO = false;
	private ArrayList<Koerper> elemente = new ArrayList<Koerper>();;
	private Punkt blickrichtung;

	public Szene(double x, double y, double z) {
		log("Szene(double, double, double)");
		this.setBlickrichtung(new Punkt(x, y, z));
	}

	public Szene() {
		this(0, 0, 1);
		log("Szene()");
	}

	public void setBlickrichtung(Punkt blickrichtung) {
		log("setBlickrichtung(Punkt)");
		this.blickrichtung = blickrichtung;
	}

	public void einfuegen(Koerper k) {
		log("einfuegen(Koerper)");
		this.elemente.add(k);
	}

	public boolean sichtbar(Koerper k) {
		log("sichtbar(Koerper)");
		// genauere Erläuterung siehe Aufgabe4.pdf
		// cos(a, b) = (a*b)/(|a|*|b|)
		double skalar = this.blickrichtung.x * k.koordinate.x + this.blickrichtung.y * k.koordinate.y
				+ this.blickrichtung.z * k.koordinate.z;

		double l1 = this.blickrichtung.abstand(new Punkt(0, 0, 0));
		double l2 = k.koordinate.abstand(new Punkt(0, 0, 0));

		double coswinkel = skalar / (l1 * l2);
		double winkel = Math.acos(coswinkel);
		// pi/4 sind 45° in rad
		return (winkel <= (Math.PI / 4));
	}

	public ArrayList<Koerper> sichtbar() {
		log("sichtbar()");

		ArrayList<Koerper> sichtbare = new ArrayList<Koerper>();

		for (int i = 0; i < elemente.size(); i++) {
			if (sichtbar(elemente.get(i))) {
				sichtbare.add(elemente.get(i));
			}
		}
		return sichtbare;
	}

	@Override
	public String toString() {
		log("toString()");
		String erg = "";

		for (int i = 0; i < elemente.size(); i++) {
			if (sichtbar(elemente.get(i))) {
				erg += "sichtbar: ";
			}
			erg += elemente.get(i).toString() + " ";
		}
		return erg;
	}

	protected void log(String methodName) {
		if (DEMO) {
			System.out.println("Klasse: " + this.getClass().getSimpleName() + " - Methode: " + methodName);
		}
	}

}
