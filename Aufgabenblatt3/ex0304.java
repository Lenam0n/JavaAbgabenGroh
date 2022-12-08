package Aufgabenblatt3;/*==========================================
file   : Aufgabenblatt3.ex0304
autor  : anna.wiederstein
date   : 21.11.2022
package: PACKAGE_NAME
==========================================*/

import java.util.Scanner;

public class ex0304 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Eingabe

        double sk;              //Startkapital
        double zS;              //Zinssatz
        int intervall;          //länge der Jahre
        double jahre;
        boolean forEach = false;
        double value1;

        System.out.println("Spareinlage Version 1.0");

        System.out.print("Bitte geben Sie das Startkapital ein: ");
        sk = input.nextDouble();
        System.out.print("Bitte geben Sie Zinssatz ein: ");
        zS = input.nextDouble();
        System.out.print("Bitte geben Sie die Länge des Vertrages ein: ");
        intervall = input.nextInt();
        System.out.print("Möchten sie für jedes Jahr den Wert sehen? ");
        forEach = input.nextBoolean();

//        Verarbeitung

        value1 = Math.round(sk * (100 + zS)/100 * 100.0) / 100.0;
        if (forEach)System.out.println("\nDas Endkapital nach dem 1. Jahre beträgt: " + value1 + "€");

        int i = 1;
        while( i < intervall){
            if(i != 0){
                sk = value1;
                value1 = Math.round(sk * (100 + zS)/100 * 100.0) / 100.0;
                i++;
                if (forEach)System.out.println("Das Endkapital nach dem "+ i +". Jahren beträgt: " + value1 + "€");

        }



    }
//        Ausgabe
        if (!forEach)System.out.println("Das Endkapital nach dem "+ i +". Jahren beträgt: " + value1 + "€");

    }}

