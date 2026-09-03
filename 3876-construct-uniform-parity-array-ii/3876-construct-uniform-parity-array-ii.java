class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] nums2=new int[nums1.length];
        int odd=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                 odd=Math.min(odd,nums1[i]);
            }
           
        }
        if(odd!=Integer.MAX_VALUE){
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]%2==0 && nums1[i]>odd){
                    nums2[i]=nums1[i]-odd;
                }
                else nums2[i]=nums1[i];
            }
        }
        boolean alleven=true;
        boolean allodd=true;
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]%2!=0) alleven=false;
            else allodd=false;
        }
        return alleven || allodd;
    }
}