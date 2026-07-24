class Solution {
    public String deleteCharacters(String s, int start, int end) {
        StringBuilder sb = new StringBuilder(s);
        sb.delete(start, end);
        return sb.toString();
    }
}