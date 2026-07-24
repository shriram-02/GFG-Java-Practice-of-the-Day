class Solution {
    public int binaryToDecimal(String b) {
        int decimal = 0;

        for (int i = 0; i < b.length(); i++) {
            decimal = decimal * 2 + (b.charAt(i) - '0');
        }

        return decimal;
    }
}