import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassExample {
    private static final String CLASS_REGEX = "^[CAP]{1}\\d{4}[A-Za-z0-9]*[GHIK]$";

    public ValidateClassExample() {}

    public boolean validate(String className) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }

}
