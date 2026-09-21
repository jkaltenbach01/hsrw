
import java.util.ArrayList;

public class MultiKoerper extends Koerper {

	private ArrayList<Koerper> komponenten;

	public MultiKoerper() {
		log("MultiKoerper()");
		komponenten = new ArrayList<Koerper>();
	}

	public void einfuegen(Koerper k) {
		log("einfuegen(Koerper)");
		komponenten.add(k);

		this.kanten.addAll(k.kanten);

		// Erster Koeper im Array bestimmt die Koordinate des MultiKoerpers
		if (komponenten.size() == 1)
			this.koordinate = k.koordinate;
	}

	public int getAnzahlTeilKoerper() {
		log("getAnzahlTeilKoerper()");
		return komponenten.size();
	}

	@Override
	public double volumen() {
		log("volumen()");
		double volumen = 0.0;

		// Foreach Schleife Inhalt wird ausgeführt für jeden Körper in komponenten
		for (Koerper k : komponenten) {
			volumen += k.volumen();
		}
		return volumen;
	}

	@Override
	public double flaeche() {
		log("flaeche()");
		double flaeche = 0.0;

		// Foreach Schleife Inhalt wird ausgeführt für jeden Körper in komponenten
		for (Koerper k : komponenten) {
			flaeche += k.flaeche();
		}
		return flaeche;
	}

	@Override
	public String toString() {
		log("toString()");
		String ausgabe = "";

		for (Koerper k : komponenten) {
			ausgabe += (k.toString() + ", ");
		}
		return ausgabe;
	}
}
