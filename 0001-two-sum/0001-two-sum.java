class Solution {
    public int[] twoSum(int[] a, int k) {
        int[] c=new int[2];
         for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==k){
                    c[0]=i;
                c[1]=j;}
                
            }
        }
        return c;
    }
}