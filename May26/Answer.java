class Solution {
    public int findMaxLength(int[] nums) {
        //change all 0 to be -1
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
		
        //store sum <sum, first index this sum appears>
        int sum = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
		
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                int firstIndex = map.get(sum);
                //sum(firstIndex + 1, i) = 0
                res = Math.max(res, i - firstIndex);
            }
        }
        return res;
    }
}