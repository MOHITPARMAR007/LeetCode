class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int count1=0;
        int ans = 0 ;
        while(i<nums.length)
        {
            if(nums[i]==1)
            {
                count1++;
            }
            else 
            {
                ans=Math.max(ans,count1);
                count1=0;

            }
            i++;
        }
        ans = Math.max(ans,count1);
        return ans;
    }
}