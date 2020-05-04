class Solution {
    public int findComplement(int num) {
        
        String a =Integer.toBinaryString(num);
        
        ArrayList<Character> array1 = new ArrayList<Character>();
        
        for (char c : a.toCharArray()){
            if(c=='1'){
                array1.add('0');
            }
            else{
                
                array1.add('1');
            }
        }
        
        String b = "";
        for(int i =0; i<array1.size();i++){
            b = b+array1.get(i);
        }
        System.out.println(b);
        
        int i = Integer.parseInt(b,2);
        
        return i;
    }
}