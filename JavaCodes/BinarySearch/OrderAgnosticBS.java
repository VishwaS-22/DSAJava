/*
    Basically OrderAgnostic means what if we don't know whether the given array is sorted or not.
*/

package vishwa;

public class OrderAgnosticBS
{
    public static void main(String[] args)
    {
        int[] arr={99,88,77,66,55,44,33,22,11};
        int searchElement=22;
        int ans=OABS(arr,searchElement);
        System.out.print(ans);
    }
    static int OABS(int[] arr1,int target)
    {
        int s = 0;
        int e = arr1.length - 1;


        boolean isAsc;
        //to check arr is sorted or not.
        isAsc= arr1[s] < arr1[e]; //Simplified If else;
        /*
         if (arr1[s] < arr1[e])
         {
            isAsc = true;
         }
         else
         {
            isAsc = false;
         }
        */
        while (s <= e)
        {
            int m = s +(e-s) / 2;

            if (arr1[m] == target)
            {
                return m;
            }
            if(isAsc)
            {
                if (target < arr1[m])
                {
                    e = m - 1;
                }
                else
                {
                    s = m + 1;
                }
            }
            else
            {
                if(target > arr1[m])
                {
                    e = m - 1;
                }
                else
                {
                    s = m + 1;
                }
            }
        }
        return -1;
    }
}
