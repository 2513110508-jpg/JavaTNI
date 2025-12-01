import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Invalid number of inputs. Exiting.");
            scanner.close();
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int evenCount = 0;
        int oddCount = 0;
        int number;

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");
            number = scanner.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nMaximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);

        scanner.close();
    }
}



