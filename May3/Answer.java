class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> array1 = new ArrayList<Character>();
       
        
        for(char c : magazine.toCharArray()){
            array1.add(c);
        }
        
        
        
        for(char c : ransomNote.toCharArray()){
            if(array1.contains(c)){
               array1.remove(array1.indexOf(c));
            }
            else
            return false;
        }
        
        
      return true;
    }
}