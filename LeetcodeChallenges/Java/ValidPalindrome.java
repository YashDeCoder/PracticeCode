import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        boolean returnValue = true;
        int pointer = 0;
        String pattern = "[a-z0-9]";
        // Need to use the pattern to remove all special characters
        s = s.toLowerCase();
        
        // Use a StringBuilder to build the new string
        StringBuilder result = new StringBuilder();
        
        // Iterate over the characters of the string
        for (char c : s.toCharArray()) {
            if (String.valueOf(c).matches(pattern)) {
                result.append(c);
            }
        }

        char[] smallString = result.toString().toCharArray();
        int n = smallString.length - 1;

        if (n < 2) {
            if (n < 1) {
                return true;
            } else if (smallString[0] == smallString[1]) {
                return true;
            } else {
                return false;
            }
        }
        
        for (int i = n;i >= 0; i--) {
            if (i == pointer) {
                break;
            }

            if (smallString[i] == smallString[pointer]) {
                pointer++;
            } else {
                returnValue = false;
                break;
            }
        }


        return returnValue;
    }

    public static void main(String[] args) {
        ValidPalindrome objPalindrome = new ValidPalindrome();
        boolean result = objPalindrome.isPalindrome("0P");
        System.out.print(result);
    }
}
