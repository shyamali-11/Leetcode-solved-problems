class Solution {
    public int[] frequencySort(int[] a) {
   

      Arrays.sort(a);

      HashMap<Integer,Integer> hs=new LinkedHashMap<>();

      for(int i=0;i<a.length;i++){

        if(hs.containsKey(a[i])){
            int val=hs.get(a[i]);
            hs.put(a[i],val+1);
        }
        else{
            hs.put(a[i],1);
        }
      }
     

     int k=0;

      while(!hs.isEmpty()&&k<a.length){
           int max=0;
           int val=0;

           for(Map.Entry<Integer,Integer> h: hs.entrySet()){
               
               if(h.getValue()>max){
                max=h.getValue();
                val=h.getKey();
               }
           }
           

           for(int i=1;i<=max&&k<a.length;i++){
            a[k++]=val;
           }

              hs.remove(val);
      }
        return reverse(a);
    }

    public int[] reverse(int[] a){
        int high=a.length-1;
        int low=0;

        while(low<high){
            int temp=a[high];
            a[high]=a[low];
            a[low]=temp;
            low++;
            high--;
        }
        return a;
    }
}
