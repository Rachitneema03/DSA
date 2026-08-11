class Solution {
    public boolean isPerfectSquare(int num) {
        long lo = 1, hi = num;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return false;
    }
}
