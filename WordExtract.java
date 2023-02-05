/**
 * Java program to extract html string using regex
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WordExtract {
        public static void main (String [] args) {
            String str = "Learning from <h1>Java Mastery</h1>";

            // Pattern object creation
            Pattern pattern = Pattern.compile("<h1(/S+)</h1>");

            Matcher matcher = pattern.matcher(str);

            if (matcher.find()) {
                String example = matcher.group(1);
                System.out.println(example);
            }

        }
}
