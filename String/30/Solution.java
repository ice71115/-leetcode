class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ret = new ArrayList<>();
        
        List<String> listW = new ArrayList<String>(Arrays.asList(words));
        int i =0;
        int numS=s.length();
        int numW=words.length;
        int lenW=words[0].length();
        int j= i+lenW*numW;
        while(j<=numS){
            String t=s.substring(i,j);
            int old=0;
            while(!listW.isEmpty() && old!=listW.size() ){
                String tempw="";
                old=listW.size();
                for(String w:listW){
                    if(t.substring(0,lenW).equals(w)){
                        t=t.substring(lenW);
                        tempw=w;
                        break;
                    }
                }
                listW.remove(tempw);
            }
            
            if(listW.isEmpty()){
                ret.add(i);
            }
            if(listW.size()!=words.length){
                listW = new ArrayList<String>(Arrays.asList(words));
            }
            i+=1;            
            j+=1;
        }
        return ret;
    }
}