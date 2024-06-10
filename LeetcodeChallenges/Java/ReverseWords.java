public class ReverseWords {
    public String reverseWords(String s) {
        // Split the string by one or more spaces
        String[] arrayStrings = s.split("\\s+");
        int n = arrayStrings.length;
        StringBuilder result = new StringBuilder();
        
        // Iterate through the array backwards to reverse the words
        for (int i = n - 1; i >= 0; i--) {
            if (!arrayStrings[i].isEmpty()) {
                result.append(arrayStrings[i]);
                if (i != 0) {
                    result.append(" ");
                }
            }
        }
        
        // Convert StringBuilder to String and return
        return result.toString().trim();
    }
    

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String s = "  hello world  ";
        String returnString = reverseWords.reverseWords(s);
        System.out.println(returnString);
    }
}
