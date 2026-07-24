class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int s = 0;
        for(int w : weights)
        {
        low = Math.max(low, w);
         s+=w;
        }
        int high  = s;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int sum = 0;
            int d = 1;
            for(int i = 0;i<weights.length;i++)
            {
                sum += weights[i];
                if(sum>mid)
                {
                    d++;
                    sum=weights[i];
                    if(d > days)
                     break;
                }
                
            }
            if(d<=days)
            {
                high = mid-1;
            }else{
                low  = mid+1;
            }
        }
        return low;
        
    }
}