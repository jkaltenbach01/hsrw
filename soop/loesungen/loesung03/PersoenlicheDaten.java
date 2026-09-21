import java.util.Scanner;


public class PersoenlicheDaten {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("erste Person");
		System.out.print("Name: ");
		String name1= s.nextLine();
		System.out.print("Vorname: ");
		String vorname1= s.nextLine();
		System.out.print("Geburtsdatum: ");
		String datum1= s.nextLine();
		System.out.print("Geschlecht: ");
		String geschlecht1= s.nextLine();
		System.out.print("Guthaben: ");
		Double guthaben1= s.nextDouble();
		s.nextLine();
		System.out.println("zweite Person");
		System.out.print("Name: ");
		String name2= s.nextLine();
		System.out.print("Vorname: ");
		String vorname2= s.nextLine();
		System.out.print("Geburtsdatum: ");
		String datum2= s.nextLine();
		System.out.print("Geschlecht: ");
		String geschlecht2= s.nextLine();
		System.out.print("Guthaben: ");
		Double guthaben2= s.nextDouble();
		System.out.printf("Person   Name             Geburtsdatum   Geschlecht   Guthaben\n");
		System.out.printf("--------------------------------------------------------------\n");
		System.out.printf("     1   %12s     %10s         %s        %8.2f\n",vorname1+" "+name1,datum1,geschlecht1,guthaben1);
		System.out.printf("     2   %12s     %10s         %s        %8.2f\n",vorname2+" "+name2,datum2,geschlecht2,guthaben2);

	}

}
