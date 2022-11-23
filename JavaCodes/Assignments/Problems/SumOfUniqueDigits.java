package vishwa;
import java.util.*;
public class SumOfUniqueDigits
{
            public static void main(String[] args)
            {
            Scanner s=new Scanner(System.in);
            int s1=0,s2=0;
            int n=s.nextInt();
            int m=s.nextInt();
            int[] arr1=new int[10];
            int[] arr2=new int[10];
            while(n!=0)
            {
                if(arr1[n%10]!=-1)
                {
                    s1+=n%10;
                    arr1[n%10]=-1;
                }
                n/=10;
            }
            while(m!=0)
            {
                if(arr2[m%10]!=-1)
                {
                    s2+=m%10;
                    arr2[m%10]=-1;
                }
                m/=10;
            }
            if(s1==s2)
                System.out.print("YES");
            else
                System.out.print("NO");
        }
    }
