import javax.swing.JOptionPane;

public class Lab401 {

    public static void main(String[] args) {
        String inputName = null;
        String[] nameParts = null;
        String message = "";

        while (true) {
            inputName = JOptionPane.showInputDialog(null,
                    "Enter your full name:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);

            if (inputName == null) {
                System.out.println("User cancelled the input.");
                return;
            }

            inputName = inputName.trim();
            nameParts = inputName.split("\\s+");

            if (nameParts.length != 2) {
                message = "โปรดกรอกรูปแบบตามนี้ [ชื่อจริง][เว้นวรรค][นามสกุล] เท่านั้น";
                JOptionPane.showMessageDialog(null, message, "Message: Input Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            String inputFirstName = nameParts[0];
            String inputLastName = nameParts[nameParts.length - 1];

            boolean isFirstNameCorrect = inputFirstName.length() > 0 &&
                    Character.isUpperCase(inputFirstName.charAt(0)) &&
                    inputFirstName.substring(1).equals(inputFirstName.substring(1).toLowerCase());

            boolean isLastNameCorrect = inputLastName.equals(inputLastName.toUpperCase());

            if (isFirstNameCorrect && isLastNameCorrect) {
                break;
            } else {
                message = "รูปแบบตัวอักษรไม่ถูกต้อง ชื่อจริงต้องขึ้นต้นด้วยตัวพิมพ์ใหญ่ และนามสกุลต้องเป็นตัวพิมพ์ใหญ่ทั้งหมด";
                JOptionPane.showMessageDialog(null, message, "Message: Formatting Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        String formattedFirstName = "";
        String formattedLastName = "";

        String firstName = nameParts[0].toLowerCase();
        if (firstName.length() > 0) {
            formattedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        }

        String lastName = nameParts[nameParts.length - 1];
        formattedLastName = lastName.toUpperCase();

        message = "Welcome, " + formattedFirstName + " " + formattedLastName;

        JOptionPane.showMessageDialog(null,
                message,
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
