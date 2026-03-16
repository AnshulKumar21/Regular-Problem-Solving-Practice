class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int sum = 0;
        while(high<k)
        {
            sum += nums[high];
            high++;
        }
                int maxSum = sum;

        while(high<nums.length)
        {
            sum = sum+nums[high]-nums[low];
            maxSum = Math.max(maxSum,sum);
            high++;
            low++;
        }
        return (double)maxSum/k;

    }
}