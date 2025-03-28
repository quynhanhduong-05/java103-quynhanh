public class PhoneNumberExampleTest {
    private static PhoneNumberExample numberExample;
    public static final String[] validNumber = new String[] {"(84)-(0978489648)"};
    public static final String[] invalidNumber = new String[] {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        numberExample = new PhoneNumberExample();
        for (String number : validNumber) {
            boolean isValid = numberExample.validate(number);
            System.out.println(number + " " + isValid);
        }
        for (String number : invalidNumber) {
            boolean isValid = numberExample.validate(number);
            System.out.println(number + " " + isValid);
        }
    }
}
