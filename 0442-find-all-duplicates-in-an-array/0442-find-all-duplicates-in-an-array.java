class Solution {
    public List<Integer> findDuplicates(int[] a) {
        

        List<Integer> li=new ArrayList<>();

        HashMap<Integer,Integer> hs=new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(!hs.containsKey(a[i]))
               hs.put(a[i],1);
            else{
                int val=hs.get(a[i]);
                hs.put(a[i],val+1);

            }
        }

        for(Map.Entry<Integer, Integer> h :
             hs.entrySet()){
            if(h.getValue()>=2)
            li.add(h.getKey());
            
        }
        return li;
    }
}