class Solution {
    public int[][] insert(int[][] a, int[] b) {

      

        List<int[]> result = new ArrayList<>();

        int i = 0;
        int start=b[0];
        int end=b[1];

        while(i<a.length&&a[i][1]<start){
            result.add(a[i]);
            i++;
        }

        while(i<a.length&&(a[i][0]<=end)){
            b[0]=Math.min(a[i][0],start);
            b[1]=Math.max(a[i][1],end);
            start=b[0];
            end=b[1];
            i++;

        }
        result.add(b);

        while(i<a.length){
            result.add(a[i]);
            i++;
        }

       

       int[][] res=new int[result.size()][2];

       for( i=0;i<result.size();i++){
               res[i]=result.get(i);
       }
       return res; 

    }
}