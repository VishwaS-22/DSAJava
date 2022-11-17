// 744. Find Smallest Letter Greater Than Target
package vishwa;
import java.util.*;
public class SmallestLetter
{
    public static void main(String[] args)
    {
        char[] arr= new char[]{'c','f','j'};
        char sE='j';
        char res= nextLargestChar(arr,sE);
        System.out.println(res);
    }
    static char nextLargestChar(char[] letters,char target)
    {
        int s=0;
        int e=letters.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(target<letters[mid])
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return letters[s%letters.length];
    }
}
