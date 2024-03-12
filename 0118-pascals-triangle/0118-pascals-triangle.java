class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        a.add(1);
        li.add(a);

        for(int i=2;i<=n;i++){
            List<Integer> fi=li.get(i-2);
            List<Integer> newfi=new ArrayList<>();
            newfi.add(1);
            for(int j=0;j<fi.size()-1;j++){
                int sum=fi.get(j)+fi.get(j+1);
                newfi.add(sum);
                
            }
            newfi.add(1);
            li.add(newfi);
        }
        return li;
    }
}