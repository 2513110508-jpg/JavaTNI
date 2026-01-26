import javax.swing.*;

public class BookMain2 {
    public static void main(String[] args) {

        String author_name = JOptionPane.showInputDialog("Enter author's name:");
        int concent = JOptionPane.showConfirmDialog( null,
                 "Prefer to publish your nationality and birthyear?");
        Author author;
        if (concent == JOptionPane.YES_OPTION) {
            String nationality = JOptionPane.showInputDialog("Input author's nationality:");
            String birthyear = JOptionPane.showInputDialog("Input author's birthyear:");
            author = new Author(author_name, nationality, Integer.parseInt(birthyear));
        } else {
            author = new Author(author_name);
        }
        JOptionPane.showMessageDialog( null, author.showAuthorInfo());
        String title = JOptionPane.showInputDialog("Enter book title:");
        String category = JOptionPane.showInputDialog("Enter book category");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter book price"));

        Book book = new Book(title, category, price, author);

        if (book.isDiscountAvailable()) {
            int discount_percent = Integer.parseInt(JOptionPane.showInputDialog("Input discount %:"));
            book.setDiscount_percent(discount_percent);
        }
        JOptionPane.showMessageDialog( null, book);
    }
}
