// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         if(nums.length ==1) return nums[0];
//         for(int i = 0;i<nums.length-1;i++)
//         {
//             int count = 1;
//             for(int j = i+1;j<nums.length;j++)
//             {
//                 if(nums[i]==nums[j])
//                 {
//                     count++;
//                 }
//             }
//             if (count>n/2)
            
//             return nums[i];
//             }
//         }
//         return -1;
        
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > n/2){
                return nums[i];
            }
        }

        return -1; // just in case
    }
}