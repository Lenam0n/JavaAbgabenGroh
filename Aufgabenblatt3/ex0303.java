package Aufgabenblatt3;/*==========================================
file   : Aufgabenblatt3.ex0303
autor  : anna.wiederstein
date   : 21.11.2022
package: PACKAGE_NAME
==========================================*/

import java.util.Scanner;

public class ex0303 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Eingabe

        double sk;              //Startkapital
        double zS;              //Zinssatz
        int intervall = 3;      //länge der Jahre
        double value;

        System.out.println("Spareinlage Version 1.0");

        System.out.print("Bitte geben Sie das Startkapital ein: ");
        sk = input.nextDouble();
        System.out.print("Bitte geben Sie Zinssatz ein: ");
        zS = input.nextDouble();

//        Verarbeitung

        //value = Math.round(sk + (sk * zS / 100) * intervall  * 100.0) / 100.0;
        value = Math.round(sk * Math.pow((100 + zS)/100 , intervall) * 100.0) / 100.0;


//        Ausgabe

        System.out.println("Das Endkapital nach dem 3. Jahre beträgt: " + value + "€");
}}
