/*==========================================
file   : Aufgabenblatt4.ex0401
autor  : anna.wiederstein
date   : 22.11.2022
package: PACKAGE_NAME
==========================================*/

package Aufgabenblatt4;
import java.util.Scanner;

public class ex0404 {
    public static void main(String[] args) {

//        Eingabe

        Scanner input = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double h = 0;
        double result = 0;
        double anzahl = 0;
        String format = "";

        boolean error = false;
        int stellen = 5;


//        Verarbeitung
        System.out.print("Welchen Körper möchtest du berechnen?: ");
        String abfrage = input.next();
        abfrage = abfrage.toUpperCase();

        switch (abfrage) {
            case "RECHTECK" -> {
                a = test("a");
                if (a == 0) error = true;
                b = test("b");
                if (b == 0) error = true;
                anzahl = 2;
                format = "cm²";
                stellen = 5;
                result = a * b;
            }
            case "KREIS" -> {
                a = test("a");
                if (a == 0) error = true;
                anzahl = 1;
                format = "cm²";
                stellen = 5;
                result = Math.PI * a / 2 * a / 2;
            }
            case "ZYLINDER" -> {
                a = test("a");
                if (a == 0) error = true;
                h = test("h");
                if (h == 0) error = true;
                anzahl = 2;
                format = "cm³";
                stellen = 2;
                result = Math.PI * a / 2 * a / 2 * h;

            }
            default -> {
                System.out.println("Test - 1");
                System.out.println("ERROR");
                error = true;
            }
        }

        //result = Math.round(result * 100000.0) / 100000.0;

//        Ausgabe

        if(!error){
            System.out.println("Der Wert für Seite a beträgt: " + a);

            if (anzahl < 1) System.out.println("Der Wert für Seite b beträgt: " + b);


            //System.out.println("Die Fläche des Körpers beträgt: " + result + " " + format);
            //if (zylinder)System.out.printf("Die Fläche des Körpers beträgt: %1.2f %s ", result, format);
            //else System.out.printf("Die Fläche des Körpers beträgt: %1.5f %s ", result, format);
        }

        String formatstring = "%" + stellen + "s" ;
        String wort = "Die Fläche des Körpers beträgt: " + formatstring + " %s";
        System.out.printf(wort , result, format);


    }



    static double test(String n) {
        System.out.print("Bitte den Wert für Seite/Durchmesser " + n +" in cm angeben: ");
        double p;
        p = new java.util.Scanner(System.in).nextDouble();
        if (p == 0) {
            System.out.println("Bitte geben Sie für Seite " + n + " einen Wert größer als 0.0 an!");

        }
        return p;
    }
}


