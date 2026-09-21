import java.util.Scanner;


public class LetzteZiffer {
	public static void main(String[] args) {  
		Scanner s = new Scanner(System.in);
		int zahl =s.nextInt();
		switch (zahl % 10) {
		case 0:
			System.out.println(zahl+" endet auf Null"); break;
		case 1:
			System.out.println(zahl+" endet auf Eins"); break;
		case 2:
			System.out.println(zahl+" endet auf Zwei"); break;
		case 3:
			System.out.println(zahl+" endet auf Drei"); break;
		case 4:
			System.out.println(zahl+" endet auf Vier"); break;
		case 5:
			System.out.println(zahl+" endet auf Fünf"); break;
		case 6:
			System.out.println(zahl+" endet auf Sechs"); break;
		case 7:
			System.out.println(zahl+" endet auf Sieben"); break;
		case 8:
			System.out.println(zahl+" endet auf Acht"); break;
		case 9:
			System.out.println(zahl+" endet auf Neun"); break;
		
		}
	}

}
