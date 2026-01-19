import java.util.Scanner;

public class StudentMain {
    public static void showInfo(Student st) {
        System.out.println("Name: " + st.getName());
        System.out.println("Year: " + st.getStudyYear());
        System.out.println("Score: " + st.getScore());
        System.out.println("Grade: " + st.getGrade());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name   : ");
        student.setName(scan.next());

        System.out.print("Enter student year   : ");
        student.setStudyYear(scan.nextInt());

        System.out.print("Enter mid-term score : ");
        student.addPoint(scan.nextInt());

        System.out.print("Enter final score    : ");
        student.addPoint(scan.nextInt());

        System.out.println();
        showInfo(student);
    }
}