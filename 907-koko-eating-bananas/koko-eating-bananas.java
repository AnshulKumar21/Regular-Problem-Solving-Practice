class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;

        int high = 0;
        for(int b:piles)
        {
            if(b>high)
            {
                high = b;
            }
        }
    
        while(low<=high)
        {
            int mid = low+(high-low)/2;

           long sum = 0;
            for(int b :piles)
            {
                sum += ((long)b+mid-1)/mid;
            }
            if(sum<=h)
            {
                
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
        return low;
    }
}