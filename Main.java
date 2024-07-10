// A regular expression is a sequence of characters that forms a search pattern.
// I believe it is used to search for a sequence or pattern 

import java.util.regex.Pattern; // defines pattern
import java.util.regex.Matcher; // searches said pattern

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("malicious code");
        Matcher matcher = pattern.matcher("HEHEHE Nobody will find my malicious code!!");

        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Their is Malicious Code in your system. Threat Identified!");
        } else {
            System.out.println("Your System is clear. No Bugs Detected.");
        }

        // There are more parameters you can add to the Pattern.compile()
        // These change how the pattern is found / what you are looking for
        // .CASE_INSENSITIVE - case will be ignored
        // .LITERAL - special characters will be treated as normal characters
        // .UNICODE_CASE - when used together with insensitive, cases for other
        // languages will be ignored
    }
}
