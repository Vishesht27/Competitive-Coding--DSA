class Solution {
    public boolean isUgly(int num) {
      if(num<=0) return false;
      if(num==1) return true;
      while(num>1){
       if(num%5==0) num/=5;
      else if(num%3==0) num/=3;
      else if(num%2==0) num/=2;
      else return false;
      }
        return true;
    }
}
