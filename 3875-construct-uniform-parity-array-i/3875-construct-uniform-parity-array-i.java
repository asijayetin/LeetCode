class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] nums2=new int[nums1.length]; // make a new array for putting elements 
        int odd=-1; // make a variable odd to find odd element because EVEN-ODD=ODD,ODD=ODD
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                odd=nums1[i]; // find odd no
                break;
            }
        }
        if(odd!=-1){ // if their was odd no find above 
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]%2==0){ // if eany even no make it odd by subtracting it from odd..
                    nums2[i]=nums1[i]-odd;
                }
                else nums2[i]=nums1[i]; // if odd just put that in nums2
            }
        }
        boolean alleven=true; // checked in num2 all odd or alleven
        boolean allodd=true;
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]%2==0) allodd=false;  // if all even allodd=false;
            else alleven=false; // if all odd alleven=false
        }
        return alleven || allodd;
    }
}