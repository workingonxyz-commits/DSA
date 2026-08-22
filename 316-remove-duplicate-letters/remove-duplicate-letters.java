class Solution {
    public String removeDuplicateLetters(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        boolean[] used = new boolean[26];
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            freq[ch - 'a']--;

            if (used[ch - 'a']) {
                continue;
            }

            while (str.length() > 0 &&
                   str.charAt(str.length() - 1) > ch &&
                   freq[str.charAt(str.length() - 1) - 'a'] > 0) {

                char removed = str.charAt(str.length() - 1);
                str.deleteCharAt(str.length() - 1);
                used[removed - 'a'] = false;
            }

            str.append(ch);
            used[ch - 'a'] = true;
        }

        return str.toString();
    }
}