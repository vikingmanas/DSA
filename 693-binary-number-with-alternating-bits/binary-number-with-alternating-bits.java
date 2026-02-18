class Solution {
    public boolean hasAlternatingBits(int n) {
        int p = 5;

        while (n > 0) {
            int k = n % 2;
            n = n / 2;

            if (p == 5) {
                p = k;
            } else {
                if (k == p)
                    return false;
                p = k;

            }
        }
        return true;
    }
}