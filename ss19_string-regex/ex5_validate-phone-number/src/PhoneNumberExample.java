import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)";

    public PhoneNumberExample() {}

    public boolean validate(String phoneNumber) {
        Pattern p = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher m = p.matcher(phoneNumber);
        return m.find();
    }
}
