class Solution {
    public List<Integer> majorityElement(int[] a) {
      Arrays.sort(a);
      List<Integer> li=new ArrayList<>();
      int max=(a.length/3)+1;
      
      int i=0,j=0,n=a.length;
      
        int count=0;
        while(i<n&&j<n){
          if(a[i]==a[j]){
            count++;
            j++;
          }
          else{
            if(count>=max)
            li.add(a[i]);
            i=j;
            j=i;
            count=0;
            } 
         }
         if(j-i>=max){
            li.add(a[i]);
         }
    

        return li;



      }
      
      }