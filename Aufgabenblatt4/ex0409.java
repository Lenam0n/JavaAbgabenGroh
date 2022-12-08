package Aufgabenblatt4;
/*==========================================
file   : ex0409
autor  : anna.wiederstein
date   : 22.11.2022
package: Aufgabenblatt4
==========================================*/

import java.util.Scanner;

public class ex0409 {
    public static void main(String[] args) {

//        Eingabe

        Scanner input = new Scanner(System.in);

        double p = 0;
        double v = 0;
        double i = 0;

        System.out.print("Bitte den Wert für die Leistung P in Watt eingeben: ");
        p = input.nextDouble();
        System.out.print("Bitte den Wert für die Spannung U in Volt eingeben: ");
        v = input.nextDouble();
        System.out.print("Bitte den Wert für den Strom I in Ampere eingeben: ");
        i = input.nextDouble();


//        Verarbeitung

        if ((p == 0 && v == 0) || (p == 0 && i == 0) || (v == 0 && i == 0)){
            System.out.println("Sie haben entweder alle oder mehr als 1 Parameter mit 0 angegeben!");
        }else {
            if (p == 0) p = (v * i) ;
            else if (v == 0) v =(p / i);
            else if (i == 0) i = (p / v);
        }


//        Ausgabe

        if(p != 0 && v != 0 && i != 0){
            //System.out.println("U = " + v + " V");
            //System.out.println("I = " + i + " I");
            //System.out.println("P = " + p + " W");

            //______________________________________

            System.out.printf("U = %.2f V" , v);
            System.out.printf("\nI = %.2f I" , i);
            System.out.printf("\nP = %.2f W" , p);


        }


    }

}
