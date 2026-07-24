class Solution {
    public static boolean isSameReference() {
        String s1 = "Java";
        String s2 = s1;

        s1 = s1.concat(" Programming");

        return s1 == s2;
    }
}