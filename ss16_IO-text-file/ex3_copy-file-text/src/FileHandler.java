import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.*;

public class FileHandler {
    public void copyFile(String sourceFile, String targetFile) {
        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            String line = "";
            BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
            while ((line = br.readLine()) != null) {
                bw.write(line);
            }
            bw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}