

public class PrimzahlTest {

	public static boolean istPrim(long x) {
		 // 2 ist die kleinste Primzahl
		 if (x <= 2) {
		    return (x == 2);
		 }
		// teste für alle Zahlen von 2 .. sqrt(n), ob n durch diese
		// teilbar ist. Falls ja: keine Primzahl
		 for (long l = 2; l <= Math.sqrt(x); l++) {
		    if (x % l == 0) {
		       return false;
		    }
		 }
		 return true; 
	}
	
	public static void main(String[] args) {
		long n = 11;
		System.out.println(istPrim(n));
	}

}
