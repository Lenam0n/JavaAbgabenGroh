package Aufgabenblatt1;

public class ex0104 {
    public static void main(String[] args) {
//        Eingabe
        int U = 230;
        double I = 4.5;
        double R = U / I;

//        Verarbeitung
        double ergebnis = Math.round(R * 100.00 ) / 100.00;

//        Ausgabe
        System.out.printf("%2%n Ohmsches Gesetz Berechnung Version 1.0\nDer Widerstand R beträgt:  "+ ergebnis + " Ohm");
    }
}
