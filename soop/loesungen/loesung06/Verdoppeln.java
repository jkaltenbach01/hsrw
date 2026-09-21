import java.util.Arrays;

public class Verdoppeln {

	public static int [] doppelt(int [] a) {
		
		for(int i = 0; i < a.length; i++) {
			a[i] = a[i] * 2;
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(doppelt(a)));

	}

}
