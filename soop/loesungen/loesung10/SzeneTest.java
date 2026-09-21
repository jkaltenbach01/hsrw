
public class SzeneTest {

	public static void main(String[] args) {

		Koerper k1 = new Koerper("rot", 0, 0, 0);
		Koerper k2 = new Koerper("blau", 10, 0, 0);

		Kugel ku1 = new Kugel("gelb", 10, 10, 10, 1);
		Kugel ku2 = new Kugel("grün", 0, 10, 10, 2);

		Wuerfel w1 = new Wuerfel("orange", 0, 0, 10, 3);
		Wuerfel w2 = new Wuerfel("pink", 10, 0, 10, 4);

		Szene sz = new Szene();

		sz.einfuegen(k1);
		sz.einfuegen(k2);
		sz.einfuegen(ku1);
		sz.einfuegen(ku2);
		sz.einfuegen(w1);
		sz.einfuegen(w2);

		System.out.println(sz.sichtbar());
		System.out.println(sz.sichtbar(w1));
		System.out.println(sz.sichtbar(w2));

	}

}
