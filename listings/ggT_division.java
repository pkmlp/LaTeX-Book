
/*

Beispielprogramm in Java

    Bestimmen des ggT von zwei eingegebenen Zahlen 
    mit dem modernen euklidschen Algorithmus

*/

// importieren der util-Klasse, die den Scanner enthaelt
import java.util.*;

public class ggT_division {
    public static void main(String args[]) {

        /* Definitionen der benoetigten Variablen */    
        int x,y,h;
        Scanner sc = new Scanner(System.in);

        /* Einlesen der 1. Zahl*/
        System.out.print("1. Zahl: ");
        x = sc.nextInt();

        /* Einlesen der 2. Zahl*/
        System.out.print("2. Zahl: ");
        y = sc.nextInt();

        /* Euklidischer Algorithmus zur Bestimmung des ggT */
        while (y > 0) {
            h = x % y;
            x = y;
            y = h;
        }

        /* Ausgeben des Ergebnisses */
        System.out.println(" ---> ggt = " + x);
        sc.close();

    }
}
