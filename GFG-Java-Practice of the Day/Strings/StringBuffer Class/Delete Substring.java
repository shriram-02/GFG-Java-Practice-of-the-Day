class Solution {
    public String deleteSubstring(String s, int start, int end) {
        StringBuffer sb = new StringBuffer(s);
        sb.delete(start, end);
        return sb.toString();
    }
}