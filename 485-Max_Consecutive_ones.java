class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int cc = 0; int mc =0;
        for(i<0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                cc++;
                
                if(cc>mc)
                {
                    mc=cc;
                }
            }
            else
            {
                c=0;
            }
            
return mc;
            }
        }
}
