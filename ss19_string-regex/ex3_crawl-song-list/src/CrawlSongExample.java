import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL ("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner sc = new Scanner (url.openStream());
            sc.useDelimiter("\\Z");
            String content = sc.next();
            sc.close();

            content = content.replaceAll("\\n+", "");

            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);

            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
