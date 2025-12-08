class Solution {
    public int maxProfit(int[] prices) {
        int minProf = Integer.MAX_VALUE ;
        int maxProf = 0;
        for(int price : prices){
            minProf = Math.min(minProf , price);
            maxProf = Math.max(maxProf , price-minProf);
        }
        return maxProf;
    }
}