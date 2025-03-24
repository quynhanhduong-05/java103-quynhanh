import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File newFile = new File("newFile.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
            bw.write("1");
            bw.write("\n2");
            bw.write("\n3");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}