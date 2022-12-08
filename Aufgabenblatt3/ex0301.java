package Aufgabenblatt3;/*==========================================
file   : Aufgabenblatt3.ex0301
autor  : anna.wiederstein
date   : 17.11.2022
package: PACKAGE_NAME
==========================================*/

import java.util.Scanner;

public class ex0301 {
    public static void main(String[] args) {

//        Eingabe

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double x;

        System.out.print("Bitte trage den Wert für a ein: ");
        a = input.nextDouble();
        System.out.print("Bitte trage den Wert für b ein: ");
        b = input.nextDouble();

        //value = a*x+b;

//        Verarbeitung

        x = b*(-1)/a;


//        Ausgabe

        System.out.println("Lineare Gleichung Version 1.0\nBitte den Wert für a angeben: "+ a +"\nBitte den Wert für b angeben: " + b + "\nDie Lösung lautet x=" + x);

   }}
