class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        while(k-->0){
            int max=pq.remove();
            int sqrt=(int) Math.sqrt(max);
            pq.add(sqrt);
        }
        long sum=0;
        while(pq.size()>0){
            sum+=pq.remove();
        }
        return sum;
    }
}