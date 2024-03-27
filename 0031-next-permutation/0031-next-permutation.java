class Solution {
    public void nextPermutation(int[] a) {
        
        int pos=-1;

        for(int i=a.length-2;i>=0;i--){
            if(a[i]<a[i+1]){
                pos=i;
                break;
            }
        }


        if(pos==-1){
            reverse(a,0,a.length-1);
            return;
        }

        for(int i=a.length-1;i>=pos;i--){
            if(a[i]>a[pos]){
                int temp=a[i];
                a[i]=a[pos];
                a[pos]=temp;
                break;
            }
        }

        reverse(a,pos+1,a.length-1);
    }


    public void reverse(int[] a,int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}