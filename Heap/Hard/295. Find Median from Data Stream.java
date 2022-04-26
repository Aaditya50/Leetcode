class MedianFinder {
    PriorityQueue<Integer> left ;
    PriorityQueue<Integer> right ;
    
    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        left.add(num);
        right.add(left.remove());
        if(right.size()>left.size()){
           left.add(right.remove());
       }
    }
    
    public double findMedian() {
        if(left.size() == right.size()){
            int i = left.peek();
            int j = right.peek();
            return (double)(i+j)/2;
        }
        return (double)left.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
