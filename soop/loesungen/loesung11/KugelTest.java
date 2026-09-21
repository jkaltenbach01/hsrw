
public class KugelTest {

	public static void main(String[] args) {
		Kugel k1 = new Kugel("blau", 2, -5, 0.4, 10);
		Kugel k2 = new Kugel("rot", 0, 0, 0, 1);
		Kugel k3 = new Kugel("gelb", 0, 10, 0, 2);
		Kugel k4 = new Kugel("schwarz", 0, 0, 0, 0);

		System.out.println("Kugel: " + k1 + ": " + k1.abstand(k2));
		System.out.println("Kugel: " + k2 + ": " + k1.abstand(k3));
		System.out.println("Kugel: " + k3 + ": " + k2.abstand(k3));
		System.out.println("Kugel: " + k4 + ": " + k3.abstand(k4));

		System.out.println("Kugel 1 Volumen:" + k1.volumen());
		System.out.println("Kugel 2 Volumen:" + k2.volumen());
		System.out.println("Kugel 3 Volumen:" + k3.volumen());
		System.out.println("Kugel 4 Volumen:" + k4.volumen());

		System.out.println("Kugel 1 Fläche:" + k1.flaeche());
		System.out.println("Kugel 2 Fläche:" + k2.flaeche());
		System.out.println("Kugel 3 Fläche:" + k3.flaeche());
		System.out.println("Kugel 4 Fläche:" + k4.flaeche());
	}

}
