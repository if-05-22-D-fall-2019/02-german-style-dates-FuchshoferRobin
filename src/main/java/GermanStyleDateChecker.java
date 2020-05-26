import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {

        final String regex = "^(3(0|1)|[0-2]?\\d)(\\-|\\.|\\s)(0?[1-9]|1[0-2])(\\-|\\.|\\s)((19|20)?\\d{2})$";

        final String checkerString = dateString;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(checkerString);

        return matcher;

    }
}
