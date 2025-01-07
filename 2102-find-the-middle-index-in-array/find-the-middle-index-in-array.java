class Solution {
    public int findMiddleIndex(int[] nums)
     {
        int total = 0 ;
        int leftsum = 0 ; 
        for(int n : nums)
        {
            total+=n ;
        }
        for(int i =0;i<nums.length;i++)
        {
            int rightsum= total-leftsum-nums[i]; // nums of i iss liye bcz it is niether on              prefix nor on suffix 
            if(leftsum==rightsum)
            {
                return i ;
            }
            leftsum+=nums[i];

        }
        return -1;
    }
}