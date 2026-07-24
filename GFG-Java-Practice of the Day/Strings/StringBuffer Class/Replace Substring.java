class Solution {
    public String replaceSubstring(String s, int start, int end, String str) {
        StringBuffer sb = new StringBuffer(s);
        sb.replace(start, end, str);
        return sb.toString();
    }
}