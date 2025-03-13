package service;

import model.Student;

import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private static Student[] studentList = new Student[100];
    static {
        studentList[0] = new Student(1, "DUONG QUYNH ANH");
        studentList[1] = new Student(2, "DO MAI ANH");
        studentList[2] = new Student(3, "PHAM THI BICH HANG");
    }

    public void DisplayStudentList() {
        System.out.println("========================================");
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                break;
            }
            System.out.println(studentList[i]);
        }
        System.out.println("========================================");
    }

    public void addStudent() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        Student student = new Student(id, name);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public void modifyStudent() {
        System.out.print("Nhập ID học sinh cần chỉnh sửa thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên học sinh cần chỉnh sửa thông tin: ");
        String name = scanner.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null &&  studentList[i].getId() == id && studentList[i].getName().equals(name)) {
                System.out.print("Nhập ID mới: ");
                int modifiedID =  Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tên: ");
                String modifiedName = scanner.nextLine();
                Student modifiedStudent = new Student(modifiedID, modifiedName);
                studentList[i] = modifiedStudent;
                break;
            }
        }
    }
}
