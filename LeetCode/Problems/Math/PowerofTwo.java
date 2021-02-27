class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n==1)
          return true;
        long pow=1;
        for(int i=1;i<n;i++)
        {
            pow *= 2;
            if(n==pow)
                return true;
            else if(pow>n)
                return false;

        }
        return false;
    }
    }
