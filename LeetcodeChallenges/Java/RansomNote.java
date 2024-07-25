import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean retBool = true;
        HashMap<Character, Integer> ransomMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> magazineMap = new HashMap<Character, Integer>();
        char[] magazineArray = magazine.toCharArray();
        char[] ransomArray = ransomNote.toCharArray();
        
        for (int i = 0; i < magazine.length(); i++) {
            if (magazineMap.containsKey(magazineArray[i])) {
                magazineMap.put(magazineArray[i], magazineMap.get(magazineArray[i]) + 1);
            } else {
                magazineMap.put(magazineArray[i], 1);
            }
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            if (ransomMap.containsKey(ransomArray[i])) {
                ransomMap.put(ransomArray[i], ransomMap.get(ransomArray[i]) + 1);
            } else {
                ransomMap.put(ransomArray[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
            char key = entry.getKey();
            if (magazineMap.containsKey(key)) {
                if (magazineMap.get(key) < entry.getValue()) {
                    retBool = false;
                }
            } else {
                retBool = false;
            }
        }

        return retBool;   
    }
}
