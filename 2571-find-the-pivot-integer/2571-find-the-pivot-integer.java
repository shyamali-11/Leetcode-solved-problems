class Solution {
    public int pivotInteger(int n) {
         int totalSum=(n*(n+1))/2;

        for(int i=1;i<=n;i++){
            int sumx=(i*(i+1))/2;
            int rem=totalSum-sumx+i;

            if(rem==sumx)
             return i;
        }

        return -1;
    }
}