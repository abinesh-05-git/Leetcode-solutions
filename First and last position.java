class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        if(nums.length==0)
            return new int[]{-1,-1};
        int first=fo(nums,target);
        int last=lo(nums,target);
        if(first==-1||last==-1) return new int[]{-1,-1};
        return new int[]{first,last};
    }
    int fo(int[] nums,int target)
    {
        int low=0;
        int high=nums.length-1;
        int f=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                f=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)   low = mid+1;
            else    high=mid-1;
        }
        return f;
    }
    int lo(int[] nums,int target)
    {
        int low=0;
        int high=nums.length-1;
        int l=1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                l=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)   low =mid+1;
            else    high=mid-1;
        }
        return l;
    }
       
    
}
