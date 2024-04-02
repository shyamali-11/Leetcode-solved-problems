class Solution {
    public void rotate(int[] a, int k) {
        int n=a.length;
        k=k%n;
       
        rotate(a,0,n-k-1);
        rotate(a,n-k,n-1);
        rotate(a,0,n-1);
       
        
    }
    void rotate(int[] a,int i,int j)
{
      while(i<j){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          i++;
          j--;

      }

}
}