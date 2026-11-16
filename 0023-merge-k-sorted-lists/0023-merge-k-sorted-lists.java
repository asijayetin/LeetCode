class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> finallist=new ArrayList<>();
        for(ListNode node:lists){
            if(node!=null) finallist.add(node);
        }
        if(finallist.size()==0) return null;
        while(finallist.size()>1){
            int n=finallist.size();
            ListNode last=finallist.get(n-1);
            ListNode secondlast=finallist.get(n-2);
            ListNode mergetwo=merge(last,secondlast);
            finallist.remove(n-1);
            finallist.remove(n-2);
            finallist.add(mergetwo);
        }
        return finallist.get(0);
        

    }
    public ListNode merge(ListNode a,ListNode b){
        ListNode temp1=a;
        ListNode temp2=b;
        ListNode ans=new ListNode(-2);
        ListNode dummy=ans;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                dummy.next=temp1;
                temp1=temp1.next;
                dummy=dummy.next;
            }
            else if(temp1.val>=temp2.val){
                dummy.next=temp2;
                temp2=temp2.next;
                dummy=dummy.next;
            }
        }
        if(temp1!=null){
            dummy.next=temp1;
        }
        if(temp2!=null){
            dummy.next=temp2;
        }
        return ans.next;
    }
   
}