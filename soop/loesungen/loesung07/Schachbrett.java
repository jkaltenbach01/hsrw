
public class Schachbrett {

	public static void schachbrett(int n) {

		double[][] schachbrett = new double[n][n];

		for (int i = 0; i < Math.pow(n, 2); i++) {
			schachbrett[i / n][i % n] = Math.pow(2, i);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf(" %22.0f", schachbrett[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		schachbrett(8);
	}

}
