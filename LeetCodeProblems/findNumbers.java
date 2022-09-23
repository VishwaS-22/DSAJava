class Solution 
{
    public int findNumbers(int[] nums) 
    {
        int ctr=0;
        for(int num:nums)
        {
            if(checkeven(num))
            {
                ctr++;
            }
        }
        return ctr;
    }
    boolean checkeven(int num)
    {
        int a=numDigits(num);
        return a%2==0;
    }
    int numDigits(int n)
    {
        if(n<0)
        {
            return n*=-1;
        }
        if(n==0)
        {
            return 1;
        }
        int c=0;
        while(n>0)
        {
            c++;
            n/=10;
        }
        return c;
    }
}
