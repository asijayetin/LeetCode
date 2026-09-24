class MedianFinder {
    PriorityQueue<Integer> minheap=new PriorityQueue<>();
    PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxheap.size()==0) maxheap.add(num);
        else{
            if(num<maxheap.peek()) maxheap.add(num);
            else minheap.add(num);
        }
        if(maxheap.size()==minheap.size()+2) minheap.add(maxheap.remove());
        if(minheap.size()==maxheap.size()+2) maxheap.add(minheap.remove());
        
    }
    
    public double findMedian() {
        if(maxheap.size()==minheap.size()) return (maxheap.peek()+minheap.peek())/2.0;
        else if(maxheap.size()==minheap.size()+1) return maxheap.peek();
        else return minheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */