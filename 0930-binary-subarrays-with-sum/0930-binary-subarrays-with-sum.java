class Solution {
    public int numSubarraysWithSum(int[] a, int goal) {
         int count=0,sum=0;
       int i=0,j=0;

      while(j<a.length){
           
           
           sum+=a[i];
           if(sum==goal){
            count++;
            i++;
           }

           else if(sum>goal){
            i=j+1;
            j=i;
            sum=0;
           }
           else
            i++;



            if(i>=a.length)
           {
              i=j+1;
              j=i;
              sum=0;
           }

         
             
            }
          


          

        
           
         

        return count;
    }
}