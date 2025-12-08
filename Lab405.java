import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;

        System.out.print("Input some sentence: ");
        sentence = sc.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point: ");
            sentence = sc.nextLine();
        }

        sentence = sentence.substring(0, sentence.length() - 1);

        String[] words = sentence.split(" ");

        System.out.println();
        for (String w : words) {
            System.out.println(w);
        }
    }
}

