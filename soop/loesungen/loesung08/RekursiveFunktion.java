

public class RekursiveFunktion {
	public static void main(String [] args) {
		System.out.println(f(5));
	}
	// a)
	public static int f(int n) {
		if (n != 1) {
			return f(n - 1) + 2 * n - 1;
		}
		return 1;
	}

	// b)
	/*
	* Quadratzahlen
	*/

	// c)
	public static int g(int n) {
		return n*n;
	}
}

/*
 * Zu zeigen: f=g
 * Induktionsanker: f(1)=1=1=g(1)
 * Induktionsschritt: f(n+1)=f(n)+2*(n+1)-1=n*n+2*n+1=(n+1)*(n+1)=g(n+1) q.e.d.
 */
