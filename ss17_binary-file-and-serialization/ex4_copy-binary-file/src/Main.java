import java.io.*;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingStream (File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file: ");
        String source = sc.nextLine();
        System.out.print("Enter destination file: ");
        String destination = sc.nextLine();

        File sourceFile = new File(source);
        File destinationFile = new File(destination);

        try {
            copyFileUsingStream(sourceFile, destinationFile);
            System.out.println("Files copied successfully");
        } catch (IOException e) {
            System.out.println("Error copying file");
            System.out.println(e.getMessage());
        }
    }
}