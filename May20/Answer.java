class StockSpanner {
    private List<Integer> prices; 
    private List<Integer> spans;
    
    public StockSpanner(){
        prices = new ArrayList<>();
        spans = new ArrayList<>();
    }
        

    public int next(int price) {
        int count = 1;
        int i = prices.size()-1;
        while(i>=0 && prices.get(i)<=price){
            count += spans.get(i);
            i -=spans.get(i);
        }
        prices.add(price);
        spans.add(count);
        return count;   
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */