class Solution {
    public int findDuplicate(int[] nums) 
    {
        
        Arrays.sort(nums);
        int i =0;
        int l=nums.length;
        int firstPointer=nums[i];
        int SecondPointer=nums[i+1];
        while(i<l)
        {

            if(firstPointer==SecondPointer)
            {
                return SecondPointer;
            }
            i++;
            firstPointer=nums[i];
            SecondPointer=nums[i+1];
        }
        return SecondPointer ;
    }
}