//The program must print the intgers by omitting the repetition. 

/*
Given i/p & o/p:
6
10 20 10 20 30 40
10 20 30 40
*/

import java.util.*;
class DistinctIntegers 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        //System.out.println(n);
        int[] arr=new int[n]; //Array for input.
        int[] c=new int[10000]; //Intialized to zero, for checking.
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            //System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            c[arr[i]]++;
            if(c[arr[i]]==1)
            {
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}
