import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        double summation = a + b;
        double subtraction = a - b;
        double multiplication = a * b;
        double division = a / b;
        double modulus = a % b;

        System.out.println("\nSummation = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + ((double)a / b));
        System.out.println("Modulus = " + (a % b));

        sc.close();
    }
}
