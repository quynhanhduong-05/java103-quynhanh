package controller;

import java.util.Scanner;

import service.StudentManager;

public class Controller {
    private StudentManager studentManager = new StudentManager();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = true;
        while (isExit) {
            System.out.println("Chương trình quản lý sinh viên");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Thoát chương trình");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Thêm sinh viên");
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Hiển thị danh sách sinh viên");
                    studentManager.DisplayStudentList();
                    break;
                case 3:
                    System.out.println("Sửa thông tin sinh viên");
                    studentManager.modifyStudent();
                    break;
                default:
                    isExit = false;
                    System.out.println("Thoát chương trình");
            }
        }
    }
}