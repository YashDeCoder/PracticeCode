import java.util.HashMap;
import java.util.Map.Entry;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        boolean retBool = true;
        HashMap<Character, Character> stringMap = new HashMap<>();
        char[] tArray = t.toCharArray();
        int pointer = 0;

        // Go through string s to assign the value to a character in t
        for (char c : s.toCharArray()) {
            if (stringMap.containsKey(c)) {
                if (stringMap.get(c) != tArray[pointer]) {
                    retBool = false;
                    break;
                } 
            } else if ( stringMap.containsValue(tArray[pointer])) {
                for (Entry valuesEntry: stringMap.entrySet()) {
                    if ((char) valuesEntry.getValue() == tArray[pointer] && (char) valuesEntry.getKey() != c) {
                        retBool = false;
                        break;
                    }
                }
                if (retBool == false) {
                    break;
                }
            } else {
                stringMap.put(c, tArray[pointer]);
            }
            pointer++;
        }

        return retBool;
    }

    public static void main(String[] args) {
        IsomorphicString object = new IsomorphicString();
        System.out.print(object.isIsomorphic("badc", "baba"));
    }
}
