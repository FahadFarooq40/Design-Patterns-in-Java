package java_patttern;
import java.util.Scanner;

public class inverted_half_pyramid_number {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of row for inverted half: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(i);
            } 
            for (int j = 1; j <= 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        scanner.close(); 
    }
}
