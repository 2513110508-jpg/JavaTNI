import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int n = sc.nextInt();

            while (n <= 0) {
                System.out.print("The number must be positive! Enter number again: ");
                n = sc.nextInt();
            }

            numbers[i] = n;
        }

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) evens.add(num);
            else odds.add(num);
        }


        System.out.print("\nList of even number: ");
        for (int i = 0; i < evens.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(evens.get(i));
        }
        System.out.println();

        System.out.print("List of odd  number: ");
        for (int i = 0; i < odds.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(odds.get(i));
        }
        System.out.println();

        sc.close();
    }
}
