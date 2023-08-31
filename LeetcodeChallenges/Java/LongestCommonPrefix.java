class LongestCommonPrefix {
    String getPrefix(String[] listStrings) {
        int N = listStrings.length;
        int smallestString = Integer.MAX_VALUE;
        String longestPrefix = "";
        boolean isAllright = true;

        for (String string : listStrings) {
            if (string.length() < smallestString) {
                smallestString = string.length();
            }
        }

        for (int i = 0; i < smallestString; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (listStrings[0].charAt(i) != listStrings[j + 1].charAt(i)) {
                    isAllright = false;
                    break;
                }
            }
            if (isAllright) {
                longestPrefix += listStrings[0].charAt(i);
            } else {
                break;
            }
        }
        return longestPrefix;
    }

    public static void main(String[] args) {

        // For the Longest Common Prefix
        LongestCommonPrefix objectString = new LongestCommonPrefix();
        String listString[] = { "dog", "doracecar", "docar" };
        String finalPrefixString = objectString.getPrefix(listString);
        System.out.println(finalPrefixString);
    }
}