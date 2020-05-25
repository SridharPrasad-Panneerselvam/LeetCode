class Solution {
public String frequencySort(String s) {

    ArrayList<Integer> list = new ArrayList<>();
    int[] count = new int[128];
    
	// Recording frequency of each character
    for(char c : s.toCharArray()) {
        count[c]++;
    }
    
	// Adding all the frequencies in the list
    for(int i = 0; i < 128; i++) {
        if(count[i] != 0)
            list.add(count[i]);
    }
    
	// Arrange the list in decreasing order
    Collections.sort(list,Collections.reverseOrder());
    StringBuilder sb = new StringBuilder();
	
	// ArrayList to Integer Array
    Integer[] arr = new Integer[list.size()];
    arr = list.toArray(arr); list.clear();
    
    for(int i = 0; i < arr.length; i++) {
        int max = arr[i];
		
        for(int j = 0; j < 128; j++) {
            if(count[j] == max) {
			
			// Append character count[j] times
                while(count[j]-- > 0) {
                    sb = sb.append((char) j);
                }
                break;
            }
        }
    }
    return sb.toString();
}
}