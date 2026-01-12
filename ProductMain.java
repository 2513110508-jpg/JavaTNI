import javax.swing.JOptionPane;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();

        JOptionPane.showMessageDialog(null, "Welcome to Product Stock System");

        product.name = JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        product.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));
        product.showInfo();
        System.out.println();
        int addConfirm = JOptionPane.showConfirmDialog(null, "Do you want to add more item?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
        if (addConfirm == JOptionPane.YES_OPTION) {
            int amountToAdd = Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?"));
            product.addStock(amountToAdd);
        }
        int priceConfirm = JOptionPane.showConfirmDialog(null, "Do you want to change price?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
        if (priceConfirm == JOptionPane.YES_OPTION) {
            double newPrice = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?"));
            product.changePrice(newPrice);
        }
        System.out.println();
        product.showInfo();
    }
}
