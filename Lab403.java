import javax.swing.JOptionPane;

public class Lab403 {
    public static void main(String[] args) {

        String userInput, passInput;
        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";

        while (true) {
            userInput = JOptionPane.showInputDialog(null, "Enter username:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (userInput == null) return;

            passInput = JOptionPane.showInputDialog(null, "Enter password:", "Input", JOptionPane.QUESTION_MESSAGE);
            if (passInput == null) return;

            if (userInput.equalsIgnoreCase(USERNAME) && passInput.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(null, "Login Success!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Login Fail...",
                        "Incorrect username or password",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

