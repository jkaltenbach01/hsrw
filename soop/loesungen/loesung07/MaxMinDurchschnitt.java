

import java.util.Scanner;

public class MaxMinDurchschnitt
{

   public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 0;
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		double summe = 0;

		System.out.print("Wie viele Zahlen möchten Sie einlesen? ");
		size = sc.nextInt();

		int[] zahlen = new int[size];

		System.out.print("Geben Sie " + size + " Zahlen ein: ");

		for (int i = 0; i < size; i++) {
			zahlen[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			if (zahlen[i] < min) {
				min = zahlen[i];
				minIndex = i;
			}
			if (zahlen[i] > max) {
				max = zahlen[i];
				maxIndex = i;
			}
			summe += zahlen[i];
		}

		System.out.println("Größte Zahl: " + max + " an Stelle " + maxIndex + "\nKleinste Zahl: " + min + " an Stelle "
				+ minIndex + "\nDurchschnitt: " + (summe / size));

	}

}