package Aufgabenblatt3;/*==========================================
file   : Aufgabenblatt3.ex0302
autor  : anna.wiederstein
date   : 21.11.2022
package: PACKAGE_NAME
==========================================*/

import java.util.Scanner;

public class ex0302 {
    public static void main(String[] args) {

//        Eingabe

        Scanner input = new Scanner(System.in);

        double fixAus;
        double varAus;
        double erlos;
        int anzahl;
        double ausgabe;

//        Verarbeitung

        System.out.print("Gebe die Fixen Kosten ein: ");
        fixAus = input.nextDouble();
        System.out.print("Gebe die Kosten für die Produkte ein: ");
        varAus = input.nextDouble();
        System.out.print("Gebe bitte den Erlös ein: ");
        erlos = input.nextDouble();
        System.out.print("Gebe bitte die Anzahl der Produkte ein: ");
        anzahl = input.nextInt();

        ausgabe = (erlos - varAus) * anzahl - fixAus;

//        Ausgabe

        System.out.println("Der Gewinn beträgt: " + ausgabe + "€");
    }
}