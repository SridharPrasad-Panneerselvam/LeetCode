class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        int[] char_count = new int[26];
        for (char c : s1.toCharArray()){
            char_count[c-'a']++;
        }
        
        int left=0;
        int right=0;
        int toVisit = s1.length();
        
        while(right<s2.length()){
            if(char_count[s2.charAt(right) - 'a'] >= 1) {
                    toVisit--; 
                } 
                char_count[s2.charAt(right) - 'a']--; // Reduce count of char at right end.
                right++; // Increment right end.

                if(toVisit == 0) list.add(left); 
                
// If you have traversed a window completely. Once you've traversed the first p.length() elements
// ie. the first window this would always be true, 
// this is here just so that we completely scan our first window, without incrementing left.
                if(right - left == s1.length()){
                    if(char_count[s2.charAt(left) - 'a'] >= 0){ 
// This would increment toVisit for characters which were found at right end and were
// present in p(charCount) because of which we decremented toVisit in the first if block
// and then some characters of p were not found in the window so we need to increment.
                        toVisit++; 
                    }
                    char_count[s2.charAt(left) - 'a']++;
                    left++; // Just to slide the window.
                }
        }
        boolean ans = list.isEmpty();
        
        if(ans == true){
            return false;
        }
        return true;
        }
    }
