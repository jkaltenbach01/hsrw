

public class LoescheMehrfache
{
   public static int[] filtereMehrfache(int[] a) {
		int[] tmp = new int[a.length];
		
		// Position, an der ins tmp-Array eingefügt wird
		int zaehler = 0;
		
		// Originalarray durchlaufen
		for (int i = 0; i < a.length; i++) {
			
			// Steht die aktuelle Zahl schon im tmp-Array?
			boolean gefunden = false;
			for (int j = 0; j < zaehler; j++) {
				if (a[i] == tmp[j]) {
					// steht schon drin
					gefunden = true;
				}
			}
			
			if (!gefunden) {
				// Übernimm aktuelle Zahl ins tmp Array
				tmp[zaehler] = a[i];
				zaehler++;
			}
		}
		
		return Arrays.copyOf(tmp, zaehler);
	}
	
	public static void main(String[] args) {
		int[] a = {3, 4, 3, 3, 0, 9, 6, 2, 4, 0};

		System.out.println(Arrays.toString(filtereMehrfache(a)));
	}

}