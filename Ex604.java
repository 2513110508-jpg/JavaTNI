import java.util.Scanner;

public class Ex604 {

    public static int input_length() {
        Scanner sc = new Scanner(System.in);
        int length;
        do {
            System.out.print("How many number to input: ");
            length = sc.nextInt();
        } while (length <= 0);
        return length;
    }

    public static int[] input_array(int length) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static int count_even(int[] numbers) {
        int count = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int length = input_length();
        int[] numbers = input_array(length);
        int evenCount = count_even(numbers);

        System.out.print("There are " + evenCount + " even number(s) in array = ");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
