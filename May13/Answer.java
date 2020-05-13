class Solution {
    public String removeKdigits(String num, int k) {
        // In case k is 0 return the original string
        if(k == 0) return num;
        
        // In case k == num.length() we will return 0 as we will remove every digit
        if(k == num.length()) return "0";
        
        Stack<Character> stk = new Stack<>();
        for(char c : num.toCharArray()){
            // In case the current digit is less than the previous digit, remove the previous digit
            while(!stk.isEmpty() && k > 0 && stk.peek() > c){
                stk.pop();
                k--;
            }
            stk.push(c);
        }
        
        // Remove the remaining digits from the tail.
        for(int i = 0; i < k; i++){
            stk.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        // Reversing the StringBuilder
        sb.reverse();
        
        // Removing the leading zeroes if any
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}