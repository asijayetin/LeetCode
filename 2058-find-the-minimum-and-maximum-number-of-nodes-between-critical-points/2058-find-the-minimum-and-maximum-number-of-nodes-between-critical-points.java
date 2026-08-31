class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans={-1,-1};
        ListNode a=head;
        ListNode b=a.next;
        ListNode c=b.next;
        if(c==null) return ans;
        int idx=1;
        int firstidx=-1;
        int secondidx=-1;
        int maxdist=-1;
        int mindist=Integer.MAX_VALUE;
        while(c!=null){
            if((b.val>a.val && b.val>c.val) || (b.val<a.val && b.val<c.val)){ 
                if(firstidx==-1) firstidx=idx;
                if(secondidx!=-1){
                    int dist=idx-secondidx;
                    mindist=Math.min(dist,mindist);
                }
                secondidx=idx;            
            }
            idx++;
            a=a.next;
            b=b.next;
            c=c.next;   
        }
        maxdist=secondidx-firstidx;
        if(maxdist==0) maxdist=-1;
        if(mindist==Integer.MAX_VALUE) mindist=-1;
        ans[0]=mindist;
        ans[1]=maxdist;
        return ans;

    }
}