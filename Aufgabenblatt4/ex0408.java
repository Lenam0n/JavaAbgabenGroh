package Aufgabenblatt4;
/*==========================================
file   : ex0406
autor  : anna.wiederstein
date   : 22.11.2022
package: Aufgabenblatt4
==========================================*/

import java.util.Scanner;

public class ex0408 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        Eingabe

        System.out.print("Bitte geben sie einen Wert für A ein: ");
        boolean A = input.nextBoolean();


        System.out.print("Bitte geben sie einen Wert für B ein: ");
        boolean B = input.nextBoolean();

//        Verarbeitung & Ausgabe

        if (!(A && B)){
            System.out.println("Y=1");
            System.out.println("case 1");
            System.out.println("False & False");
        } else if (!(A && !B)) {
            System.out.println("Y=0");
            System.out.println("case 2");
            System.out.println("False & True");
        } else if (!(!A && !B)) {
            System.out.println("Y=0");
            System.out.println("case 3");
            System.out.println("True & True");
        } else if (!(!A && B)) {
            System.out.println("Y=0");
            System.out.println("case 4");
            System.out.println("True & False");
        }
        else {
            System.out.println("ERROR");
        }







    }
}
