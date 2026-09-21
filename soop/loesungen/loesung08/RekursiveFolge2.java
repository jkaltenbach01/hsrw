

public class RekursiveFolge2 {
	public static void main(String [] args) {
		
		for (int i=1;i<11;i++) {
			System.out.println(m(i));
		}
		
	}
	public static double m(int i) {
		
		if (i==1) {
			return .5;
		}
		return m(i-1)+(i/(i+1.0));
	
	}
}
