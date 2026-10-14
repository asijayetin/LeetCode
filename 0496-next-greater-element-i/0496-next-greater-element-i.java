class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int j;
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) break;
            }
            Stack<Integer> st=new Stack<>();
            for(int k=nums2.length-1;k>=j;k--){
                while(st.size()>0 && nums2[k]>=st.peek()) st.pop();
                if(nums2[k]==nums1[i]){
                    if(st.size()==0) nge[i]=-1;
                    else nge[i]=st.peek();
                }
                 st.push(nums2[k]);
            }
            
           
        }
        return nge;
    }
}
