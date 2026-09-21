import java.util.Scanner;

public class Wahrheitstabelle_Teilaufgabe_c_mit_2dim_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Anzahl der Spalten: ");
		int n = scan.nextInt();
		
		int zeilen = (int) Math.pow(2, n);
		int[][] m = new int[zeilen][n];
		int teiler = zeilen / 2;
		
		// Array erzeugen
		// Hier wird das Array spaltenweise aufgefüllt
		// Dabei wird der Wert der Zelle nach folgenden Formel berechnet:
		// (Spalte / Teiler) % 2
		// Dabei ist Teiler zu Beginn Zeilen / 2 (siehe Initialisierung oben)
		// nach jeder Spalte wird Teiler halbiert
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < zeilen; j++) {
				m[j][i] = (j / teiler) % 2;
			}
			teiler = teiler / 2;
		}
		
		// Array ausgeben
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
