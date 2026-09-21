

public class Quersumme {

	public static void main(String[] args) {

		System.out.println(quersumme(234));

	}
	public static int quersumme(long n){

		if (n==0) {
			return 0;
		}
		return (int) (quersumme(n / 10) + (n % 10));
	}

}
