public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        int length = 0;
        boolean word = false;

        if (index == 0 && s.charAt(index) == ' ') {
            return 0;
        } else {

            while (index >= 0) {
                if ((s.charAt(index) == ' ') && !word) {
                    index--;
                } else {
                    if (s.charAt(index) != ' ') {
                        length++;
                        index--;
                        word = true;
                    } else {
                        break;
                    }
                }
            }
            return length;
        }
    }
}
