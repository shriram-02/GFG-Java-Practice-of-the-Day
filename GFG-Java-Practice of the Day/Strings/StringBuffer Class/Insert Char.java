class Solution {
    public String insertCharacter(String s, char ch, int index) {
        StringBuffer sb = new StringBuffer(s);
        sb.insert(index, ch);
        return sb.toString();
    }
}