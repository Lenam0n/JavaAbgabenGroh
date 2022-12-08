package Aufgabenblatt2;/*==========================================
file   : Main
autor  : anna.wiederstein
date   : 10.11.2022
package: PACKAGE_NAME
==========================================*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ex0205 {
    public static void main(String[] args) {
//        Eingabe
        System.out.println("Erstes Wort eintragen:");
        Scanner s = new Scanner(System.in);
        String wort = s.next();
        Scanner myObj = new Scanner(wort).useDelimiter("\\s*,\\s*");

//        Verarbeitung & Ausgabe

        System.out.print(myObj.next());
        System.out.print(myObj.next());
        myObj.close();

    }}
