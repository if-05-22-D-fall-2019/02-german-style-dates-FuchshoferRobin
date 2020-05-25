import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {

        final String regex = "\\d{1,2}(\\w|\\s)0?\\d{1,2}(\\w|\\s)\\d{1,4}";

        final String checkerString = dateString;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(checkerString);

        return matcher;


    }
}
