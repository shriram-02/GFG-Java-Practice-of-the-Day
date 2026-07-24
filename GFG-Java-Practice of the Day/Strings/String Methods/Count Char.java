package Strings.String Methods;

public class Solution {
    public static int countChar(String s, char ch) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
} {
  
}
