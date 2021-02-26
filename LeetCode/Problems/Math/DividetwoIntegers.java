class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)return Integer.MAX_VALUE;
    if(divisor==1)return dividend;

    int count=0;
    int divi=Math.abs(dividend);
    int div=Math.abs(divisor);
    while((divi-div)>=0){
        if(count==Integer.MAX_VALUE)return Integer.MAX_VALUE;
        else count++;
        divi-=div;
    }
    if((divisor<0 && dividend>=0) || (divisor>=0 && dividend<0))return count*(-1);
    return count;
    }
}
