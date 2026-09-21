

import java.util.Scanner;

public class PhysikalischeBerechnung {

	private static Scanner scanner;

	public static void main(String[] args) {
		int programm;
		System.out.println("(0) Geschwindigkeit aus Weg und Zeit");
		System.out.println("(1) Kraft aus Masse und Beschleunigung");
		System.out.println("(2) Widerstand aus Spannung und Stromstärke");
		System.out.println("(3) Leistung aus Spannung und Stromstärke");
		System.out.println("");

		// Eingabe
		scanner = new Scanner(System.in);
		System.out.print("Berechnung wählen (0..3): ");
		programm = scanner.nextInt();
		System.out.println("");

		// Auswahl
		switch (programm) {
		case 0:
			// Geschwindigkeit aus Weg und Zeit
			double v,
			s,
			t;
			System.out.println("Geschwindigkeit aus Weg und Zeit");
			System.out.print("Weg [m]: ");
			s = scanner.nextDouble();
			System.out.print("Zeit [s]: ");
			t = scanner.nextDouble();
			if (t == 0) {
				System.out.println("Division durch 0 nicht definiert");
			} else {
				v = s / t;
				System.out.println("Geschwindigkeit = " + v + " m/s");

			}
			break;

		case 1:
			// Kraft aus Masse und Beschleunigung
			double f,
			m,
			a;
			System.out.println("Kraft aus Masse und Beschleunigung");
			System.out.print("Masse [kg]: ");
			m = scanner.nextDouble();
			System.out.print("Beschleunigung [m/s^2]: ");
			a = scanner.nextDouble();
			f = m * a;
			System.out.println("Kraft = " + f + " N");
			break;

		case 2:
			// Widerstand aus Spannung und Stromstärke
			double u,
			r,
			i;
			System.out.println("Widerstand aus Spannung und Stromstärke");
			System.out.print("Spannung [V]: ");
			u = scanner.nextDouble();
			System.out.print("Stromstärke [A]: ");
			i = scanner.nextDouble();
			if (i == 0) {
				System.out.println("Division durch 0 nicht definiert");
			} else {
				r = u / i;
				System.out.println("Widerstand = " + r + " Ohm");
			}
			break;

		case 3:
			// Leistung aus Spannung und Stromstärke
			double p,
			u2,
			i2;
			System.out.println("Leistung aus Spannung und Stromstärke");
			System.out.print("Spannung [V]: ");
			u2 = scanner.nextDouble();
			System.out.print("Stromstärke [A]: ");
			i2 = scanner.nextDouble();
			p = u2 * i2;
			System.out.println("Leistung = " + p + " Watt");
			break;

		default:
			System.out.println("Kein Programm mit der Zahl " + programm
					+ " bekannt.");
			break;
		}
	}

}
