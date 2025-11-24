import javax.swing.JOptionPane;

public class Lab205 {
    public static void main(String[] args) {
        String inputMinute = JOptionPane.showInputDialog(
                null,
                "Input minutes:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );

        if (inputMinute == null) {
            return;
        }

        int totalMinute = Integer.parseInt(inputMinute);

        int hour = totalMinute / 60;
        int minute = totalMinute % 60;

        String message = totalMinute + " minutes is " + hour +
                " hour " + minute + " minute";

        JOptionPane.showMessageDialog(
                null,
                message,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
