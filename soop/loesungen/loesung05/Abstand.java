

public class Abstand {

	public static double abstand(double x1, double x2, double y1, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static void main(String[] args) {
		System.out.println(abstand(0.0, 4.0, 0.0, 3.0));
	}
}
