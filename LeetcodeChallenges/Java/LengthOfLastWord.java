class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LengthOfLastWord object = new LengthOfLastWord();
        String s = " penis ";
        int k = object.lengthOfLastWord(s);
    }
}