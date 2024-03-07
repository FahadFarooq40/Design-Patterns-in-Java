package java_patttern;

import java.util.Scanner;

public class inverted_half {
    public static void main(String[] args) {
        Scanner rows = new Scanner (System.in);
        System.out.print("Enter the number of rows:  ");
        int Scanner = rows.nextInt();
         for (int i = Scanner; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

         }
         rows.close();
    }
}
