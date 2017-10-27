/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1AHITM
 * ----------------------------------------------------------
 * Übungsnr.:   14
 * Übungstitel: Mehrwertsteuer
 * Autoren:     Quirin Ecker
 * Version:     1.0
 * Datum:       27.10.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Berechnung der Mehrwertsteuer.
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Berechnung der Mehrwertsteuer und Ausgabe mit printf.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Ecker_Mehrwertsteuer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double MEHRWERTSTEUER = 20;
        double gesamtpreisnetto;
        double gesamtpreisbrutto;

        System.out.print("Stückzahl: ");
        double stueckzahl = scanner.nextDouble();

        System.out.print("Einzelpreis: ");
        double einzelpreis = scanner.nextDouble();

        gesamtpreisnetto = stueckzahl * einzelpreis;
        gesamtpreisbrutto = gesamtpreisnetto / 100 * 120;

        System.out.printf("Gesamtpreis netto : %8.2f \n" , gesamtpreisnetto);
        System.out.printf("Mehrwersteuer     : %8.2f %% \n" , MEHRWERTSTEUER);
        System.out.printf("Gesamtpreis brutto: %8.2f \n" , gesamtpreisbrutto);
    }
}
