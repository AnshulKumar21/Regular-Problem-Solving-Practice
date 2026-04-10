class Solution {
    public void sortColors(int[] nums) {
       int end = nums.length-1;
       int low = 0;
       int mid = 0;
       int high = end;
       while(mid<=high)
       {
        if(nums[mid]==0)
        {
         swap(nums,mid,low);
         mid++;
         low++;
        }
          else if(nums[mid]==2)
        {
         swap(nums,mid,high);
         high--;
        }
        else{
            mid++;
        }
       }
    }
    public void swap(int[] nums, int i, int j)
{
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
}
