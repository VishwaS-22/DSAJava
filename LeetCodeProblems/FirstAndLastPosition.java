//34. Find First and Last Position of Element in Sorted Array

package vishwa;

import java.util.Arrays;

public class FirstAndLastPosition
{
    public static void main(String[] args)
    {
        int[] arr = {5,7,7,8,8,10};
        int sE=7;
        int[] res=searchRange(arr,sE);
        System.out.println(Arrays.toString(res));

    }
    static int[] searchRange(int[] nums,int target)
    {
        int[] ans={-1,-1};
        ans[0] = search(nums,target,true);
        if(ans[0]!=-1)
        {
            ans[1]=search(nums,target,false);
        }
        return ans;
    }
    static int search(int[] nums1,int target1,boolean firstStartIndex)
    {
        int ans=-1;
        int s=0;
        int e=nums1.length-1;

        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(target1<nums1[m])
            {
                e=m-1;
            }
            else if(target1>nums1[m])
            {
                s=m+1;
            }
            else
            {
                ans=m; //index value
                if(firstStartIndex)
                {
                    e=m-1;
                }
                else
                {
                    s=m+1;
                }
            }
        }
        return ans;
    }
}
