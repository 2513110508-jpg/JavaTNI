import javax.swing.JOptionPane;

public class Lab402 {

    public static void main(String[] args) {
        String studentId = null;
        String major = "";
        String message = "";
        boolean isValidInput = false;

        while (!isValidInput) {
            studentId = JOptionPane.showInputDialog(null,
                    "Enter student-id:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);

            if (studentId == null) {
                System.out.println("User cancelled the input.");
                return;
            }

            studentId = studentId.trim();

            if (studentId.length() == 10) {
                try {
                    Long.parseLong(studentId);
                    isValidInput = true;
                } catch (NumberFormatException e) {
                    message = "รหัสนักศึกษาต้องเป็นตัวเลขทั้งหมด และมีความยาว 10 หลัก";
                    JOptionPane.showMessageDialog(null,
                            message,
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                message = "รหัสนักศึกษาไม่ครบ 10 หลัก, โปรดกรอกใหม่ให้ถูกต้อง";
                JOptionPane.showMessageDialog(null,
                        message,
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        String majorCode = "";
        if (studentId.length() == 10) {
            majorCode = studentId.substring(2, 5);
        }

        switch (majorCode) {
            case "131":
                major = "Information Technology (IT)";
                break;
            case "132":
                major = "Multimedia Technology (MT)";
                break;
            case "133":
                major = "Digital Business Information Technology (BI)";
                break;
            case "134":
                major = "Digital Technology in Mass Communication (DC)";
                break;
            case "135":
                major = "Data Science and Data Analytics (DS)";
                break;
            default:
                major = "Cannot found major";
                break;
        }

        message = "Student ID: " + studentId + "\n" +
                "Major: " + major;

        JOptionPane.showMessageDialog(null,
                message,
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
 