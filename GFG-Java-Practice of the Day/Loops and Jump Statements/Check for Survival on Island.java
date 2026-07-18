class Solution {
    public int minimumDays(int S, int N, int M) {
        if (N < M) {
            return -1;
        }

        int buyingDays = S - (S / 7);
        int totalFood = S * M;

        if (buyingDays * N < totalFood) {
            return -1;
        }

        return (totalFood + N - 1) / N;
    }
}