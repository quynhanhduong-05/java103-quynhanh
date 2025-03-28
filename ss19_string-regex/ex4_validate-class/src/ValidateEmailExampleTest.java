public class ValidateEmailExampleTest {
    private static ValidateClassExample classExample;
    public static final String[] validClass = new String[] {"C0223G", "A0323K"};
    public static final String[] invalidClass = new String[] {"M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new ValidateClassExample();
        for (String classes : validClass) {
            boolean isValid = classExample.validate(classes);
            System.out.println(classes + " " +  isValid);
        }

        for (String classes : invalidClass) {
            boolean isValid = classExample.validate(classes);
            System.out.println(classes + " " +  isValid);
        }
    }
}
