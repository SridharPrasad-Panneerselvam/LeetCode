class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        if(coordinates.length==2){
            return true;
        }
        
        for(int i=1;i<coordinates.length-1;i++){
            int x1 = coordinates[i-1][0];
            int y1 = coordinates[i-1][1];
            int x2 = coordinates[i][0];
            int y2 = coordinates[i][1];
            int x3 = coordinates[i+1][0];
            int y3 = coordinates[i+1][1];
            
            if((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))!=0){
                return false;
            }
            
        }
        return true;
    }
}