class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
         ArrayList<Integer> li=new ArrayList<>();
         for(int i=0;i<m;i++){
            li.add(a[i]);
         }
         for(int i=0;i<n;i++){
            li.add(b[i]);
         }
         Collections.sort(li);

         for(int i=0;i<li.size();i++){
            a[i]=li.get(i);
         }
    }
}