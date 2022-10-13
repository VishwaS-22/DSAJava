class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
        int i=0;
        while(i<nums.length)
        {
            int j=i+1;
            while(j<nums.length)
            {
                if(target==nums[i]+nums[j])
                {
                    return new int[] {i,j};
                }
                j++;
            }
        i++; 
        }
        return  null;
        
    }

}
