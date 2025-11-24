import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        final double PRICE_PER_CUSTOMER = 299.0;
        final double VAT = 0.07;

        DecimalFormat df = new DecimalFormat("0.00");

        String customerCountStr = JOptionPane.showInputDialog(
                null,
                "How many customer?",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );

        if (customerCountStr == null) return;
        int customerCount = Integer.parseInt(customerCountStr);

        double NoVAT = customerCount * PRICE_PER_CUSTOMER;
        double sumvat = NoVAT * VAT;
        double WithVAT = NoVAT + sumvat;

        String priceDisplay = "Price with NET is " + df.format(WithVAT) + " baht.";
        String discountSt = JOptionPane.showInputDialog(
                null,
                priceDisplay + "\nHow much of discount (%) on your coupon?",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );

        if (discountSt == null) return;
        double discountPercent = Double.parseDouble(discountSt);

        double discountAmount = WithVAT * (discountPercent / 100.0);
        double finalPrice = WithVAT - discountAmount;

        String finalPriceDisplay = "Total price is " + df.format(finalPrice) + " baht.";
        String paidAmountSt = JOptionPane.showInputDialog(
                null,
                finalPriceDisplay + "\nEnter the amount the customer paid:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );

        if (paidAmountSt == null) return;
        double paidAmount = Double.parseDouble(paidAmountSt);

        double change = paidAmount - finalPrice;

        String summaryMessage = "Total price is " + df.format(finalPrice) + " baht." +
                "\nCustomer paid " + df.format(paidAmount) + " baht." +
                "\nGet change " + df.format(change) + " baht.";

        JOptionPane.showMessageDialog(
                null,
                summaryMessage,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
