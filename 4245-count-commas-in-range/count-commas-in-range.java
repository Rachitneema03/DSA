class Solution {
    public int countCommas(int n) {
        int comma = 0;
        while(n >= 1000){
            comma++;
            n--;
        }
        return comma;
    }
}