import java.util.Arrays;

public class Viererfolge {

	public static void main(String[] args) {

		int[] zahlenfolge = { 2, -1, 7, 3, 3, 3, 3, 3, 9, 0 };

		System.out.print("Die Zahlenfolge " + Arrays.toString(zahlenfolge)
				+ " enthält mindestens 4 gleiche aufeinanderfolgend Zahlen: " + viererfolge(zahlenfolge));
	}

	public static boolean viererfolge(int[] zahlen) {

		int zaehler = 1;

		for (int i = 1; i < zahlen.length; i++) {
			if (zahlen[i - 1] == zahlen[i]) {
				zaehler++;
				if (zaehler == 4) {
					return true;
				}
			} else {
				zaehler = 1;
			}
		}
		return false;
	}

}
