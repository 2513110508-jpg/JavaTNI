import java.util.Scanner;
public class StudentMain2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Student[] st = new Student[3];

        for (int i = 0; i<st.length; i++) {

            System.out.print("Enter student name: ");
            st[i].name = scanner.next();
            System.out.print("Enter student id : ");
            st[i].id = scanner.next();
            System.out.print("Enter homework score: ");
            int homework_score = scanner.nextInt();
            st[i].doHomework(scanner.nextInt());

            System.out.println();
            st[i].showStatus();
        }
        for (Student s : st){
            System.out.println();
            s.showStatus();
        }
    }
}

