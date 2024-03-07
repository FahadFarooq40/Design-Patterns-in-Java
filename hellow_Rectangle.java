package java_patttern;

/**
 * hellow_Rectangle
 */
public class hellow_Rectangle {

    public static void main(String[] args) {
        int Row = 8;
        int Column = 12;
        for (int i = 1; i <= Row ; i++) {
            for (int j = 1; j <= Column; j++) {
              if (i == 1 || j == 1 || Row == i || Column == j) { 
                System.out.print("*");
              } 
              else {
                System.out.print(" ");
              }  
            }
            System.out.println();
        }
    }
}