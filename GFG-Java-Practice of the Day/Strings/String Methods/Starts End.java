class Solution {
    public static boolean check(String s, String prefix, String suffix) {
        return s.startsWith(prefix) && s.endsWith(suffix);
    }
}