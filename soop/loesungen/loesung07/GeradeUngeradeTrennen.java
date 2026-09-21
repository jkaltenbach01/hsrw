

import java.util.Scanner;

public class GeradeUngeradeTrennen
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] zahlen = new int[10];

		System.out.print("Geben Sie zehn Zahlen ein: ");

		for (int i = 0; i < 10; i++) {
			zahlen[i] = sc.nextInt();
		}

		System.out.print("Gerade Zahlen: ");
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] % 2 == 0) {
				System.out.print(zahlen[i] + " ");
			}
		}
		System.out.print("\nUngerade Zahlen: ");
		for (int i = 0; i < zahlen.length; i++) {
			if (zahlen[i] % 2 != 0) {
				System.out.print(zahlen[i] + " ");
			}
		}

	}

}
