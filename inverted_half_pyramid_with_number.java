package java_patttern;
import java.util.Scanner;


public class inverted_half_pyramid_with_number {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Enter the number of rows for inverted half pyramid: ");

        Scanner Scanner = new Scanner(System.in);
        Scanner number1 = new Scanner(System.in);

        int number = Scanner.nextInt();
        int number1 = Scanner.nextInt();

for (int i = 1; i <= number; i++) {
    for (int j = 1; j < number-i+1; j++) {
        System.out.print(number1);
    }
    System.out.println("");
    
}
Scanner.close();


    }
}
