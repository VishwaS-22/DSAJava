// Add a digit to every digits in an integer.

import java.util.*;
class AddDigit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        long n = ip.nextLong();
        long m = ip.nextLong();
        int c=0;
        long[] arr = new long[100];
        while(n>0)
        {
            arr[c]=n%10;
            n/=10;
            c++;
        }
        for(int i=c-1;i>=0;i--)
        {
            arr[i]+=m;
            System.out.print(arr[i]);
        }
    }
}
