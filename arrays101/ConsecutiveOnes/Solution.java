class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, greatest = 0, length = nums.length;
        
        for(int i = 0; i < length; ++i)
        {
            if(nums[i] == 1) ++count;
            else if(count > greatest) 
            {
                greatest = count;
                count = 0;
            }
            else count = 0;
            if(i == length-1 && count > greatest) greatest = count; 
        }
        return greatest;
    }
}