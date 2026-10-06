
package uebung01;

/**
 * uebung01
*/
public class uebung01 {
    
    public static void main(String[] args) {
        /*
        lies x ein
        setze z auf 0
        solange x ungleich 1 tue
            falls x gerade
                halbiere x
            sonst
                verdreifache x und erhöhe um 1
            erhöhe z um 1
        gib z aus
        */
        
        int x = 13;
        int z = 0;

        while (x != 1) {
            if (x % 2 == 0) {
                x = x/2;
            }
            else{
                x = x * 3 + 1;
            }

            z += 1;
        }

        System.out.println(z);
    }
}