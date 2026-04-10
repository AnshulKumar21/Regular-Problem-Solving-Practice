class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        int majority = 0;
        if(nums.length ==1) return nums[0];
        for(int i = 0;i<nums.length-1;i++)
        {
            int count = 1;
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if (count>majority)
            { majority = count;
            ans = nums[i];
            }
        }
        return ans;
        
    }
}