class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        //for(int i=0;i<nums.length;i++){
            //map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //}
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i: nums){
            if(list.contains(i)){
                list.remove(Integer.valueOf(i));
            }else{
                list.add(i);
            }
        }
        
       return list.get(0); 
    }
    
}   

//another solution

class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        Iterator it = map.keySet().iterator();
        
        while(it.hasNext()){
            int c = (int)it.next();
            if(map.get(c)==1){
                return c;
            }
        }
       return -1; 
    }
    
}