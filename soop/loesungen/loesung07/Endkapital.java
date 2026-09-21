import java.util.Scanner;

public class Endkapital
{
   public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Anfangsinvestition: ");
		double k1 = sc.nextDouble();
		long k0 = (long) (k1 * 10000);
		System.out.print("Jährlicher Zins: ");
		double z = sc.nextDouble();

		System.out.println("Jahre\t\tEndkapital");
		for (int t = 1; t <= 30; t++) {
			System.out.printf("%4d\t\t%10.2f\n", t, endKapital(k1, z, t));
		}

		System.out.println("\nJahre\t\tEndkapital");
		for (int t = 1; t <= 30; t++) {
			System.out.printf("%4d\t\t%10.2f\n", t, endKapLong(k0, z, t) / 10000.0);
		}

	}

	public static double endKapital(double k0, double z, int t) {

		return k0 * Math.pow((1.0 + (z / 100.0)), t);

	}

	public static long endKapLong(long k0, double z, int t) {

		return (long) ((k0 * Math.pow((1.0 + (z / 100.0)), t)));

	}

}
