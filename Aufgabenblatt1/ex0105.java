package Aufgabenblatt1;

public class ex0105 {
    public static void main(String[] args){
        int stellen = 6;
        long a = 0;
        int i = 0;
        String formatstring = "%" + stellen + "d" ;
        while(i < stellen){
           a = (long)Math.pow(10,i);
           System.out.printf(formatstring +"\n",a);
           i++;
        }

    }

}
