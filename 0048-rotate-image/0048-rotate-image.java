class Solution {
    public void rotate(int[][] a) {
           
    int[][] b=new int[a[0].length][a.length];
     int row=0,col=0;
       int j=0;
       while(j<a.length&&row<b.length){
           int i=a.length-1;
           col=0;
           while(i>=0&&col<b[0].length){
               b[row][col]=a[i][j];
               i--;
               col++;
           }
           j++;
           row++;
       }


     for(int i=0;i<b.length;i++){
         for(j=0;j<b[i].length;j++){
             a[i][j]=b[i][j];
         }
     }
    }
}