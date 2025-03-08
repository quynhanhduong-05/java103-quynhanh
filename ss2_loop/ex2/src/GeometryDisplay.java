import java.util.Scanner;

public class GeometryDisplay {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int height1, width1;
                    System.out.println("Enter the height of the rectangle:");
                    height1 = input.nextInt();
                    System.out.println("Enter the width of the rectangle:");
                    width1 = input.nextInt();
                    for (int i = 0; i < height1; i++) {
                        for (int j = 0; j < width1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("Choose the type of the triangle:");
                    System.out.println("1. top-left");
                    System.out.println("2. top-right");
                    System.out.println("3. bottom-left");
                    System.out.println("4. bottom-right");
                    System.out.println("Enter the type of the triangle:");
                    int choice2 = input.nextInt();
                    System.out.println("Enter the height of the triangle:");
                    int height2 = input.nextInt();
                    switch (choice2) {
                        case 1:
                            for (int i = 0; i < height2; i++) {
                                for (int j = height2; j > i; j--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 0; i < height2; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = height2; k > i; k--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 0; i < height2; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 0; i < height2; i++) {
                                for (int j = height2-1; j > i; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 0; k <= i; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    int height3 = input.nextInt();
                    for (int i = 0; i < height3; i++) {
                        for (int j = height3-1; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i*2+1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}