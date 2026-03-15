class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int count = 0;

        int low = 0;
        int high = 0;
        int prod = 1;

        while(low < nums.length)
        {

            prod *= nums[high];

            if(prod < k)
            {
                count++;
                high++;

                if(high == nums.length)
                {
                    low++;
                    high = low;
                    prod = 1;
                }
            }
            else
            {
                low++;
                high = low;
                prod = 1;
            }
        }

        return count;
    }
}