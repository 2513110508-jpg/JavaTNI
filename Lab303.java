import java.util.Scanner;
public class Lab303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for X coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter the value for Y coordinate: ");
        int y = sc.nextInt();
        System.out.print("The coordinate point (" + x + "," + y + ") lies in ");
        if (x == 0 && y == 0) {
            System.out.print("the Origin");
        } else if (x > 0 && y > 0) {
            System.out.print("the First quadrant");
        } else if (x < 0 && y > 0) {
            System.out.print("the Second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.print("the Third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.print("the Fourth quadrant");
        } else if (x == 0) {
            System.out.print("the Y-axis");
        } else if (y == 0) {
            System.out.print("the X-axis");
        }
    }
}