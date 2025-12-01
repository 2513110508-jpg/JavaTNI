import javax.swing.JOptionPane;

public class Lab307 {
    public static void main(String[] args) {
        double total = 0.0;
        double currentPrice = -1;
        boolean validInput = false;
        String errorMessage = "";

        while (currentPrice != 0) {
            String input = null;
            validInput = false;

            do {
                input = JOptionPane.showInputDialog(null,
                        errorMessage + "Input price [press 0 to stop]:",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE
                );

                if (input == null) {
                    return;
                }

                try {
                    currentPrice = Double.parseDouble(input);

                    if (currentPrice < 0) {
                        errorMessage = "Invalid price!!\n";
                        validInput = false;
                    } else {
                        validInput = true;
                        errorMessage = "";
                    }
                } catch (NumberFormatException e) {
                    errorMessage = "Invalid price!!\n";
                    validInput = false;
                }

            } while (!validInput);

            if (currentPrice > 0) {
                total += currentPrice;
            }
        }

        JOptionPane.showMessageDialog(null,
                String.format("Total price is %.2f baht.", total),
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
