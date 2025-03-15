import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Jones", 40);
        hashMap.put("John", 50);
        hashMap.put("Jane", 60);

        System.out.println("Displey entries in HashMap:");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Jones", 40);
        linkedHashMap.put("John", 50);
        linkedHashMap.put("Jane", 60);

        System.out.println("\nThe age for " + "John is " + linkedHashMap.get("John") + "\n");
    }
}
