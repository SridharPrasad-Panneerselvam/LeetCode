class Solution {
    public int[] countBits(int num) {
        int[] n = new int[num+1];
        
        for (int i = 1; i < n.length; i++)
            n[i] = (i%2 == 1) ? n[i-1] + 1 : n[i/2];
        
        return n;
    }
}