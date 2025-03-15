import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedList<Character> max = new LinkedList<Character>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<Character>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));{}
                } else {
                    break;
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character c : max) {
            System.out.print(c);
        }
        System.out.println();
    }
}