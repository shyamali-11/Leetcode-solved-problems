
        class Solution {
    public int[][] merge(int[][] a) {
         List< List< Integer > > li=new ArrayList<>();

       
         if(a.length==1){
             
             return a;

         }
         Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                // Sorting based on the first column
                return Integer.compare(a[0], b[0]);
            }
        });
        int start= a[0][0],end=a[0][1];

             int i=1;
         while(i<a.length){
             
               if(a[i][0]<=end&&a[i][0]>=start){
                
                    if(a[i][0]<start)
                      start=a[i][0];
                    if(a[i][1]>end)
                      end=a[i][1];

                    i++;
               }
               else{

                    List<Integer> fi=new ArrayList<>();
                   fi.add(start);
                   fi.add(end);

                   if(!li.contains(fi))
                     li.add(fi);
                     
                     start=a[i][0];
                     end=a[i][1];
    

                     i++;
               }
         }

           List<Integer> fi=new ArrayList<>();
                  fi.add(start);
                   fi.add(end);

                   if(!li.contains(fi))
                     li.add(fi);
        
        int[][] b=new int[li.size()][li.get(0).size()];
        for( i=0;i<li.size();i++){
          for(int j=0;j<li.get(i).size();j++){
            b[i][j]=li.get(i).get(j);
          }
        }
        return b;
    }
}