import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue ;
            int left = i+1;
            int right = n-1;
            while(left < right)
            {
                int sol =  nums[i] + nums[right] + nums[left];
                if(sol==0)
                {
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left] == nums[left+1]) left++;
                    while(left<right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if (sol<0) left++;
                else right--;
            }
        }
            
        return ans;
    }
}
