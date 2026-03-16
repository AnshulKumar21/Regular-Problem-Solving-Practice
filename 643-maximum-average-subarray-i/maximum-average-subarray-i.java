class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int sum = 0;
        double avg;
        while(high<k)
        {
            sum += nums[high];
            high++;
        }
        avg = (double)sum/k;
        double maxAvg = avg;
        while(high<nums.length)
        {
            sum = sum+nums[high]-nums[low];
            avg = (double)sum/k;
            maxAvg = Math.max(maxAvg,avg);
            high++;
            low++;
        }
        return maxAvg;

    }
}