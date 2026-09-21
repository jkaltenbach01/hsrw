

public class Max {

	public static void main(String[] args) {
		System.out.println(max(2, 1));
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}
}