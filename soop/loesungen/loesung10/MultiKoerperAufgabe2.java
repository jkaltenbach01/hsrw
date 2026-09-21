
import java.util.Arrays;

public class MultiKoerperAufgabe2 extends Koerper {
	private Koerper[] komponenten;
	private int anzahl = 0;

	public MultiKoerperAufgabe2(int anzahl) {
		log("MultiKoerper(int)");
		this.komponenten = new Koerper[anzahl];
	}

	public MultiKoerperAufgabe2() {
		this(1);
		log("MultiKoerper()");
	}

	public void einfuegen(Koerper k) {
		log("einfuegen(Koerper)");
		if (this.anzahl == this.komponenten.length) {
			// Array ist voll, Platz für neue Komponente schaffen
			this.komponenten = Arrays.copyOf(this.komponenten, this.anzahl + 1);
		}
		if (this.anzahl == 0) {
			this.koordinate = k.koordinate;
		}
		this.komponenten[this.anzahl] = k;
		this.anzahl++;
	}

	public int getAnzahlTeilKoerper() {
		log("getAnzahlKoerper()");
		return this.anzahl;
	}

	@Override
	public double volumen() {
		log("volumen()");
		double volumen = 0.0;

		for (int i = 0; i < this.komponenten.length; i++) {
			if (this.komponenten[i] != null) {
				volumen += this.komponenten[i].volumen();
			}
		}
		return volumen;
	}

	@Override
	public double flaeche() {
		log("flaeche()");
		double flaeche = 0.0;

		for (int i = 0; i < this.komponenten.length; i++) {
			if (this.komponenten[i] != null) {
				flaeche += this.komponenten[i].flaeche();
			}
		}
		return flaeche;
	}

	@Override
	public String toString() {
		log("toStrin()");
		String ausgabe = "";

		for (int i = 0; i < this.komponenten.length; i++) {
			if (this.komponenten[i] != null) {
				ausgabe += (this.komponenten[i].toString() + ", ");
			}
		}
		return ausgabe;
	}
}
