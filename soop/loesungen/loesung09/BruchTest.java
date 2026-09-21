
public class BruchTest {

	public static void main(String[] args) {
		test();
	}

	public static void test() {
		for (int i = -1; i <= 1; i += 2) {
			for (int j = -1; j <= 1; j += 2) {
				for (int k = -1; k <= 1; k += 2) {
					for (int l = -1; l <= 1; l += 2) {
						System.out.println(i + " " + j + " " + k + " " + l);
						Bruch a = new Bruch(3 * i, 4 * j);
						Bruch b = new Bruch(2 * k, 5 * l);
						System.out.println(a.wert());
						System.out.println(b.wert());
						System.out.println(Bruch.addiere(a, b));
						System.out.println(Bruch.subtrahiere(a, b));
						System.out.println(Bruch.multipliziere(a, b));
						System.out.println(Bruch.dividiere(a, b));

					}

				}
			}

		}
	}

}
