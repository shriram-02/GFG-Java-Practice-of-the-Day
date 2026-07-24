class Solution {
    public static int countObjects() {
        String s = "Java";
        int count = 1;

        s = s.concat(" Programming");
        count++;

        s = s.toUpperCase();
        count++;

        s = s.replace('A', 'X');
        count++;

        return count;
    }
}