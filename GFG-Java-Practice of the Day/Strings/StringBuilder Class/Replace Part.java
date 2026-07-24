class Solution {
    public String replacePart(String s, int start, int end, String replacement) {
        StringBuilder sb = new StringBuilder(s);
        sb.replace(start, end, replacement);
        return sb.toString();
    }
}