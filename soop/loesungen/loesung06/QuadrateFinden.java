
import java.util.Arrays;

public class QuadrateFinden {

	public static int[] quadrat(int[] a) {
		
		int [] temp = new int [a.length];
		int zaehler = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			// Wenn die Wurzel der Zahl quadriert die Zahl ergibt, ist sie eine Quadratzahl
			int wurzel = (int) Math.sqrt(a[i]);
			
			if(a[i] == (wurzel * wurzel)) {
				temp[zaehler] = a[i];
				zaehler++;
			}
		}
		
        // Ergebnis-Array erstellen und füllen
		int [] erg = new int [zaehler];
		
		for(int i = 0; i < erg.length; i++) {
			erg[i] = temp[i];
		}
		
		return erg;
	}
	
	public static void main(String[] args) {

		int [] eingabe = {5, 1, 1849, 25, 6};
		int [] erg = quadrat(eingabe);
		System.out.println("Quadratzahlen im Array: " + Arrays.toString(erg));

	}

}
