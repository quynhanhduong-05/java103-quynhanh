import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File sourceFile = new File("sourceFile.txt");
        File targetFile = new File("targetFile.txt");
        try {
            sourceFile.createNewFile();
            targetFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFile));
            bw.write("Hi, my name is Quynh Anh");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }

        FileHandler newFile = new FileHandler();
        System.out.print("Source file path: ");
        Scanner scanner = new Scanner(System.in);
        String sourceFilePath = scanner.nextLine();
        System.out.print("Target file path: ");
        String targetFilePath = scanner.nextLine();
        newFile.copyFile(sourceFilePath, targetFilePath);
    }
}