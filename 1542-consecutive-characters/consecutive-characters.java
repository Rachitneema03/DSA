class Solution {
    public int maxPower(String s) {
        int run = 1;
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                run++;
            } else {
                run = 1;
            }
            max = Math.max(max, run);
        }

        return max;
    }
}