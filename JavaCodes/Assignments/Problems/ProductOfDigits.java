//Product of digits in the integers.

package vishwa;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int n1;
        for(int i=0;i<n;i++)
        {
            int s=1;
            n1=in.nextInt();
            while(n1>0)
            {
                s*=n1%10;
                n1/=10;
            }
            System.out.print(s+" ");
        }
    }
}
