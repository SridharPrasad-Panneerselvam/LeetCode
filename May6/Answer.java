class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(map.containsKey(n) && map.get(n)>nums.length/2){
                return nums[i];
            }
        }
        
        return -1;
    }
}