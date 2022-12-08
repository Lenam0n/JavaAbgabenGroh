package Aufgabenblatt2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex0204 {
    public static void main (String[] args) throws IOException {

//        eingabe

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Spannung (U) eintragen:");
        double U = Double.parseDouble(br.readLine());
        System.out.println("Ampere (I) eintragen:");
        double I =Double.parseDouble(br.readLine());
        System.out.println("Widerstand (R) eintragen:");
        double R = Double.parseDouble(br.readLine());
        System.out.println("Abfrage eintragen:");
        String abfrage = br.readLine();
        abfrage = abfrage.toUpperCase();
        String referenz1 = "Spannung (U)";
        String referenz2 = "Ampere (I)";
        String referenz3 = "Widerstand (R)";
        double losung;

//        verarbeitung
        switch (abfrage) {
            case "R":
                losung = U / I;
                System.out.println("Ohmsches Gesetz Berechnung Version 1.0\nDie " + referenz1 +" beträgt:  " + U + "\nDer " + referenz2 +" beträgt:  " + I + "\nDer Wert " + abfrage +" beträgt: " + losung);
                break;
            case "U":
                losung = R * I;
                System.out.println("Ohmsches Gesetz Berechnung Version 1.0\nDas " + referenz2 +" beträgt:  " + I + "\nDer " + referenz3 +" beträgt:  " + R + "\nDer Wert " + abfrage +" beträgt: " + losung);
                break;
            case "I":
                losung = U / R;
                System.out.println("Ohmsches Gesetz Berechnung Version 1.0\nDer " + referenz1 +" beträgt:  " + U + "\nDer " + referenz3 +" beträgt:  " + R + "\nDer Wert " + abfrage +" beträgt: " + losung);
                break;
            default:
                System.out.println("ERROR");
                break;
        }

//        ausgabe

    }
}
