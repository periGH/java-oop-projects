import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.enroll();
//        student.payTuition();
//        System.out.println(student.toString());

        // Ask how many new students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Creat n number of new students
        for(int n=0; n<numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString() +"\n");
        }
        //System.out.println(students[1].toString());
    }
}
