import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character you want to count: ");
        char find = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(find)) {
                count++;
            }
        }
        System.out.println("Your character count is: " + count);
    }
}
