class Solution {
    public String customSortString(String order, String s) {
        ArrayList<Character> st=new ArrayList<>();
         

           for(int i=0;i<s.length();i++){
                 st.add(s.charAt(i));
          }
          String str="";


          for(int i=0;i<order.length();i++){
              int j=0;
              while(j<st.size()){
                  if(st.get(j)==order.charAt(i)){
                      str+=Character.toString(order.charAt(i));
                      st.remove(j);
                  }
                  else
                   j++;
              }
          }
          for(int i=0;i<st.size();i++){
              str+=Character.toString(st.get(i));
          }

         
         
          return str;
    }
}