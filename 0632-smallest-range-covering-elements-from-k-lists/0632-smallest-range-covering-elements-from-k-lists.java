class Solution {
    public class Triplet implements Comparable<Triplet>{
        int ele;
        int row;
        int col;
        Triplet(int ele,int row,int col){
            this.ele=ele;
            this.row=row;
            this.col=col;
        }
        public int compareTo(Triplet t){
            return this.ele-t.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int n=nums.size();
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(nums.get(i).get(0),min);
            max=Math.max(nums.get(i).get(0),max);
            pq.add(new Triplet(nums.get(i).get(0),i,0));
        }
        int a=min;
        int b=max;
        while(true){
            Triplet top=pq.remove();
            int ele=top.ele;
            int row=top.row;
            int col=top.col;
            if(max-ele < b-a){
                a=ele;
                b=max;
            }
            if(col==nums.get(row).size()-1) break;
            int next=nums.get(row).get(col+1);
            max=Math.max(max,next);
            pq.add(new Triplet(next,row,col+1));
        }
        return new int[]{a,b};

    }
}