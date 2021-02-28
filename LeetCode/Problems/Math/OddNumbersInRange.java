class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int diff = high - low;
        if(low%2!=0){
            count++;
            diff-=1;
        }
        if(high%2!=0){
            count++;
            diff-=1;
        }
        count+=diff/2;
        return count;
    }

}
