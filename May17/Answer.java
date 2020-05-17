class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(s.length()==0 || s==null){
            return list;
        }
        
        int[] char_count = new int[26];
        for(char c : p.toCharArray()){
            char_count[c-'a']++;
        }
        
        int left=0;
        int right=0;
        int toVisit =p.length();
        
        while(right<s.length()){
// If char at right end of window is present in p(charCount)
                if(char_count[s.charAt(right) - 'a'] >= 1) {
                    toVisit--; 
                } 
                char_count[s.charAt(right) - 'a']--; // Reduce count of char at right end.
                right++; // Increment right end.

                if(toVisit == 0) list.add(left); 
                
// If you have traversed a window completely. Once you've traversed the first p.length() elements
// ie. the first window this would always be true, 
// this is here just so that we completely scan our first window, without incrementing left.
                if(right - left == p.length()){
                    if(char_count[s.charAt(left) - 'a'] >= 0){ 
// This would increment toVisit for characters which were found at right end and were
// present in p(charCount) because of which we decremented toVisit in the first if block
// and then some characters of p were not found in the window so we need to increment.
                        toVisit++; 
                    }
                    char_count[s.charAt(left) - 'a']++;
                    left++; // Just to slide the window.
                }
        }
        
        return list;
    }
    
}