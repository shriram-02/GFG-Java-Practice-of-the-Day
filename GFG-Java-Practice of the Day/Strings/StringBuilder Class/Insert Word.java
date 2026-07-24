class Solution {
    public String insertWord(String s, String word, int index) {
        StringBuilder sb = new StringBuilder(s);
        sb.insert(index, word);
        return sb.toString();
    }
}