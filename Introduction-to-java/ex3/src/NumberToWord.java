import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hỏi người dùng nhập số
        System.out.print("Enter a number (0 - 999): ");
        int number = scanner.nextInt();

        // Kiểm tra nếu số lớn hơn 999
        if (number > 999 || number < 0) {
            System.out.println("Out of ability");
        } else {
            System.out.println(convertNumberToWords(number));
        }

        scanner.close();
    }

    // Chuyển đổi số thành chữ
    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        String result = "";

        if (number >= 100) {
            int hundreds = number / 100;
            result += getOnes(hundreds) + " hundred";
            number = number % 100;
            if (number > 0) {
                result += " and ";
            }
        }

        if (number >= 10 && number < 20) {
            result += getTens(number);
        } else if (number >= 20) {
            int tens = number / 10;
            int ones = number % 10;
            result += getTens(tens * 10);
            if (ones > 0) {
                result += " " + getOnes(ones);
            }
        } else if (number > 0) {
            result += getOnes(number);
        }

        return result;
    }

    public static String getOnes(int number) {
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    public static String getTens(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            case 20: return "twenty";
            case 30: return "thirty";
            case 40: return "forty";
            case 50: return "fifty";
            case 60: return "sixty";
            case 70: return "seventy";
            case 80: return "eighty";
            case 90: return "ninety";
            default: return "";
        }
    }
}
