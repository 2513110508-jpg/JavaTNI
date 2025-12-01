import javax.swing.JOptionPane;

public class Lab302 {
    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog(null, "Enter your name");


        String heightStr = JOptionPane.showInputDialog(null, "Enter your height (cm.)");
        double height = Double.parseDouble(heightStr);


        int gender = JOptionPane.showConfirmDialog(
                null,
                "Are your biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION
        );

        double weightStandard = 0;

        if (gender == JOptionPane.YES_OPTION) {

            weightStandard = height - 100;

            JOptionPane.showMessageDialog(
                    null,
                    "Hello, Mr." + name + "\n" +
                            "Your height is " + height + " cm.\n" +
                            "Your weight should be " + String.format("%.1f", weightStandard) + " kg."
            );

        } else {

            int genderFemale = JOptionPane.showConfirmDialog(
                    null,
                    "Are your biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION
            );

            if (genderFemale == JOptionPane.YES_OPTION) {

                weightStandard = height - 110;

                JOptionPane.showMessageDialog(
                        null,
                        "Hello, Ms." + name + "\n" +
                                "Your height is " + height + " cm.\n" +
                                "Your weight should be " + String.format("%.1f", weightStandard) + " kg."
                );

            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "You can use BMI to measure your weight and height."
                );
            }
        }
    }
}

