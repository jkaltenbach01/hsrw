

public class KoerperTest {

	public static void main(String[] args) {
		Koerper k1 = new Koerper("blau", 2, -5, 0.4);
		Koerper k2 = new Koerper("rot", 0, 0, 0);
		Koerper k3 = new Koerper("gelb", 0, 10, 0);
		Koerper k4 = new Koerper();
		
		System.out.println("Körper: "+ k1 +": " + k1.abstand(k2));
		System.out.println("Körper: "+ k2 +": " + k1.abstand(k3));
		System.out.println("Körper: "+ k3 +": " + k2.abstand(k3));
      System.out.println("Körper: "+ k4 +": " + k3.abstand(k4));
	}
}
