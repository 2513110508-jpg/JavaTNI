import java.util.Scanner;



public class ProductMain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;



        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;



        System.out.println("Welcome to Mini Shop");
        System.out.println("----------------------------");
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");



        System.out.print("Enter a number: ");
        int choice = scan.nextInt();



        while (choice != 1 && choice != 2) {
            System.out.print("Invalid number! Enter a number, again: ");
            choice = scan.nextInt();
        }
        System.out.println();
        Product selectedProduct = (choice == 1) ? product1 : product2;



        selectedProduct.showInfo();
        System.out.println("----------------------------");
        System.out.print("How many " + selectedProduct.name + " do you want to buy? ");
        int amount = scan.nextInt();



        selectedProduct.sell(amount);
        System.out.println("----------------------------");
        selectedProduct.showInfo();
    }
}
