// Time Complexity :o(logn)
// Space Complexity :o(1) 
// Did this code successfully run on Leetcode : it runs good in leat code
// Any problem you faced while coding this : no
class Solution {
    public int findPeakElement(int[] nums) {
        // null check
       
       int n=nums.length; int low=0;
        int high=n-1;
        
            while(low<=high){
                int mid=low+(high-low)/2;
            if((mid==0) || nums[mid]>nums[mid-1]
            && (mid==n-1)|| nums[mid]>nums[mid+1] )
            {
            return mid;
            }else if(nums[mid]>nums[mid-1])
            {    
                low= mid+1;
            }else{
                high=mid-1;
            }
            }
            return 252;
        
    }
}