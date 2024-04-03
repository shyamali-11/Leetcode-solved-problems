class Solution {
    public int[] relativeSortArray(int[] A1, int[] A2) {
     
      Arrays.sort(A1);
       HashMap<Integer,Integer> hs=new LinkedHashMap<>();

       for(int i=0;i<A1.length;i++){
        if(hs.containsKey(A1[i])){
            int val=hs.get(A1[i]);
            hs.put(A1[i],val+1);
        }
        else
          hs.put(A1[i],1);
       }

       int[] b=new int[A1.length];

       int k=0;

       for(int i=0;i<A2.length;i++){
           
            if(hs.containsKey(A2[i])){
                for(int j=1;j<=hs.get(A2[i])&&k<b.length;j++){
                    b[k++]=A2[i];

                   
                }
                 hs.remove(A2[i]);
            }


       }

       for(Map.Entry<Integer,Integer> h:hs.entrySet()){
             int freq=h.getValue();

             for(int i=1;i<=freq&&k<b.length;i++){
                b[k++]=h.getKey();
             }
       }


       return b;


    }
}

