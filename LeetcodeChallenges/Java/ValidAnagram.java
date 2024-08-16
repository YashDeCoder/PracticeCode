import java.util.HashMap;
import java.util.Map.Entry;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        boolean retBool = true;
        HashMap<Character, Integer> sHashMap = new HashMap<>();
        HashMap<Character, Integer> tHashMap = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char sChar : s.toCharArray()) {
            if (sHashMap.containsKey(sChar)) {
                sHashMap.put(sChar, sHashMap.get(sChar) + 1);
            } else {
                sHashMap.put(sChar, 1);
            }
        }

        for (char tChar : t.toCharArray()) {
            if (tHashMap.containsKey(tChar)) {
                tHashMap.put(tChar, tHashMap.get(tChar) + 1);
            } else {
                tHashMap.put(tChar, 1);
            }
        }

        for (Entry entry : sHashMap.entrySet()) {
            if (!(tHashMap.containsKey(entry.getKey()))) {
                retBool = false;
                break;
            } else if (!(tHashMap.get(entry.getKey()).equals(entry.getValue()))) {
                retBool = false;
                break;
            }
        }

        return retBool;
    }

    public static void main(String[] args) {
        ValidAnagram object = new ValidAnagram();

        System.out.print(object.isAnagram("anagram", "nagaram"));
    }
}
