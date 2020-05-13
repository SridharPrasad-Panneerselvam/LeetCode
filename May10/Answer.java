class Solution {
    public int findJudge(int N, int[][] trust) {
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        if(N==1 && trust.length==0){
            return 1;
        }
        
        for(int i=0; i< trust.length;i++){
            
            if(!list.contains(trust[i][0])){
            list.add(trust[i][0]);
            }
            map.put(trust[i][1],map.getOrDefault(trust[i][1],0)+1);
        }
        
        Iterator it = map.keySet().iterator();
        
        while (it.hasNext())
        {
            int c = (int)it.next();
            if(map.get(c) == N-1 && !list.contains(c))
                return c;
        }
        
        return -1;
    }   
}