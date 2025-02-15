import java.util.Scanner;

public class PassedStudents {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the number of students: ");
            n = input.nextInt();
            if (n > 30) {
                System.out.println("You must enter less than 30 students!");
            }
        } while (n > 30);
        int[] students = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student #" + (i + 1) + " GPA: ");
            students[i] = input.nextInt();
            if (students[i] >= 5) {
                count++;
            }
        }
        System.out.println("Total number of passed students is: " + count);
    }
}
