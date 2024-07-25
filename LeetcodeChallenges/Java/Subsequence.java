public class Subsequence {
    
    public boolean isSubsequence(String s, String t) {
        boolean retBool = false;
        char[] tArray = t.toCharArray();
        char[] sArray = s.toCharArray();
        int j = 0;

        if (s.length() == 0) {
            return true;
        } else if (t.length() == 0) {
            return false;
        }



        for (int i = 0; i < tArray.length; i++) {
            if (sArray[j] == tArray[i]) {
                j++;
                if (j == sArray.length) {
                    retBool = true;
                    break;
                }
            }
        }

        return retBool;    
    }

    public static void main(String[] args) {
        Subsequence object = new Subsequence();
        System.out.print(object.isSubsequence("abc", "ahbgdc"));
    }
}
