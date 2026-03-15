class Solution {
    public long countCommas(long n) {
        if(n < 1000) return 0;

        long nv = n;
        long count = 0;
        long start=  1000;

        while(start <= nv){
            count += nv-start+1;
            start *= 1000;
        }
        return count;
    }
}