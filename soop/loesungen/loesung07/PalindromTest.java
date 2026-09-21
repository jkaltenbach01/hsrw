

public class PalindromTest
{

   public static void main(String[] args) {

		System.out.println(istPalindrom(3449443));
		System.out.println(istPalindrom(3449543));
		System.out.println(istPalindrom(0));
		System.out.println(istPalindrom(543));

	}

	public static int zahlRueckwaerts(int n) {
		int ergebnis = 0;

		while (n != 0) {
			// verzehnfachen und letzte Ziffer addieren
			ergebnis = ergebnis * 10 + n % 10;
			// letzte Ziffer wegwerfen
			n = n / 10;
		}

		return ergebnis;
	}

	public static boolean istPalindrom(int n) {
		return n == zahlRueckwaerts(n);
	}

}
