import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        boolean retBool = true;
        HashMap<Character, String> patternMap = new HashMap<>();
        // Need to divide based off of space
        String[] divided = s.split(" ");

        if (divided.length > pattern.length()) {
            return false;
        }

        // Wait if the s array can be larger than the pattern does it mean we can use multiple words together for the pattern?
        for (int i = 0; i < pattern.length(); i++) {
            if (i >= divided.length) {
                return false;
            }

            if (patternMap.containsKey(pattern.charAt(i))) {
                if (!(patternMap.get(pattern.charAt(i)).equalsIgnoreCase(divided[i]))) {
                    retBool = false;
                    break;
                } 
            } else {
                // Check for the case that the value is already associated to another key before adding it
                if (patternMap.containsValue(divided[i])) {
                    retBool = false;
                    break;
                } else {
                    patternMap.put(pattern.charAt(i), divided[i]);
                }
            }
        }
        
        return retBool;        
    }

    public static void main(String[] args) {
        WordPattern wordObj = new WordPattern();
        System.out.print(wordObj.wordPattern("jquery", "jquery"));
    }
}
