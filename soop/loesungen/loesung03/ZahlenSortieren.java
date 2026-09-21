import java.util.Scanner;

public class ZahlenSortieren {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if ((a <= b) && (b <= c)) {
			System.out.println("Die Reihenfolge lautet: " + a + " " + b + " "
					+ c);
		} else if ((c <= a) && (a <= b)) {
			System.out.println("Die Reihenfolge lautet: " + c + " " + a + " "
					+ b);
		} else if ((b <= c) && (c <= a)) {
			System.out.println("Die Reihenfolge lautet: " + b + " " + c + " "
					+ a);
		}

		else if ((c <= b) && (b <= a)) {
			System.out.println("Die Reihenfolge lautet: " + c + " " + b + " "
					+ a);
		} else if ((a <= c) && (c <= b)) {
			System.out.println("Die Reihenfolge lautet: " + a + " " + c + " "
					+ b);
		} else {
			System.out.println("Die Reihenfolge lautet: " + b + " " + a + " "
					+ c);
		}
	}

}
