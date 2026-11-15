class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // 1. Skip all spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // If we reached the beginning after skipping leading spaces, stop
            if (i < 0) {
                break;
            }

            // 2. Mark the end of the current word
            int end = i;

            // 3. Move left until we hit a space or the start of the string
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // 4. Add a single separator space if this isn't the first word added
            if (sb.length() > 0) {
                sb.append(' ');
            }

            // 5. Append the word (from i + 1 to end inclusive)
            sb.append(s.substring(i + 1, end + 1));
        }

        return sb.toString();
    }
}