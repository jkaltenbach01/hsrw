import java.util.Scanner;

public class GroessereZahl {

	public static void main(String[] args) {
		// ganzzahlige Variable x und y deklarieren
		int x;
		int y;
				
		// Variable s vom Typ Scanner deklarieren
		Scanner s;
		// Festlegen, dass s von der Konsole einlesen soll 
		s = new Scanner(System.in);
			
		// Nachricht auf die Konsole ausgeben
		// der Variablen x die Eingabe von der Konsole zuweisen
		System.out.print("Geben Sie eine ganze Zahl ein: ");			
		x = s.nextInt();
		
		// Nachricht auf die Konsole ausgeben
		// der Variablen y die Eingabe von der Konsole zuweisen
		System.out.print("Geben Sie eine ganze Zahl ein: ");			
		y = s.nextInt();

		// testen, welche Zahl größer ist
		if (x > y) {
			System.out.println(x + " ist größer als " + y);
		} else if (y > x) {
			System.out.println(y + " ist größer als " + x);
		} else {
			System.out.println("Beide Zahlen sind gleich groß");
		}
	}

}
