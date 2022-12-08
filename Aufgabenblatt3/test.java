package Aufgabenblatt3;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

    String input = "1 , 2 , red , blue ,";
    Scanner s = new Scanner(input).useDelimiter("\\s*,\\s*");
     System.out.println(s.nextInt());
     System.out.println(s.nextInt());
     System.out.println(s.next());
     System.out.println(s.next());
     s.close();
}}

