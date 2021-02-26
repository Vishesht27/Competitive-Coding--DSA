class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;
        if(original<0)
            return false;
        while(x!=0){
            int last = x%10;
            reversed = reversed*10 + last;
            x = x/10;
        }
        if(original==reversed)
            return true;
        else
            return false;
    }
}
