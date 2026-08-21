class Solution {
    public boolean isValid(String s) {

        String str = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                str = str + ch;
            }
            else{
                if (str.length() == 0) {
                    return false;
                }
                char last = str.charAt(str.length() - 1);
                if ((last == '(' && ch == ')') ||
                    (last == '{' && ch == '}') ||
                    (last == '[' && ch == ']')) {

                    str = str.substring(0, str.length() - 1);

                } else {
                    return false;
                }
            }
        }
        return str.length() == 0;
    }
}