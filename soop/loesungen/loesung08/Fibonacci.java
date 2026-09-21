

public class Fibonacci {
   
   private static long count = 0;

	public static void main(String[] args) {

		for (int i = 1; i <= 40; i++) {
			long start = System.currentTimeMillis();
			System.out.println("Ergebnis: " + fibonacci(i) + " Aufrufe: " + count);
			System.out.println(System.currentTimeMillis() - start + "msec");
			start = System.currentTimeMillis();
			System.out.println("Ergebnis: " + fibIt(i));
			System.out.println(System.currentTimeMillis() - start + "msec");
		}

	}

	public static long fibonacci(int n) {

		count++;
		if (n < 3) {
			return 1;
		}
		return fibonacci(n - 2) + fibonacci(n - 1);
	}

	public static long fibIt(int n) {

		if (n < 3) {
			return 1;
		}

		long fOld = 1;
		long fOld2 = 1;
		long fNew = 1;

		for (int i = 3; i <= n; i++) {
			fNew = fOld + fOld2;
			fOld2 = fOld;
			fOld = fNew;
		}

		return fNew;
	}

}