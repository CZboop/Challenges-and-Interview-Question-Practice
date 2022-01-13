import java.util.regex.*;

public class StringUtils {

  public static boolean isVowel(String s) {
    Pattern pattern = Pattern.compile("[aeiouAEIOU]");
    Matcher matcher = pattern.matcher(s);
    boolean isMatch = matcher.matches();
    if (isMatch){
      return true;
    }
    return false;
  }
}