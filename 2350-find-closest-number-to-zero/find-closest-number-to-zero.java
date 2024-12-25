class Solution {
    public int findClosestNumber(int[] nums) {
       int min=nums[0];
       for(int i : nums){
        if(i>=0 && min>0 && min>i){
            min=i;
        }
        else if(i>0 && min<0 && min<=-i){
            min=i;
        }
        else if(i<0 && min<0 && min<i){
            min=i;
        }
        else if(i<0 && min>0 && i>-min){
            min=i;
        }
       }
       return min;
    }
}