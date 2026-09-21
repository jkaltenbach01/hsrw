

public class MinMax {

	public static int max(int a, int b) {
		// ist a > b?
		if (a > b) {
			return a;
		}
		// a ist nicht größer als b
		return b;
	}
	
	public static int minmax(int a, int b, boolean max) {
		// Maximum zurückliefern?
		if (max) {
			// ja!
			return max(a, b);
		}
		// Minimum soll zurückgeliefert werden
		// Alternative: return a + b - max(a, b);
		return Math.min(a, b);
	}
	
	public static void main(String[] args) {
		System.out.println(minmax(-14, -3, false));
	}
}
