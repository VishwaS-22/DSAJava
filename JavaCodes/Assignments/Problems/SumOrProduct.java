// Print sum of all digits if given N is even, or it prints product.
package vishwa;
import java.util.*;
public class SumOrProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();
        int c;
        if(n%2!=0)
        {
            c=0;
        }
        else{
            c=1;
        }
        if(c==0)
        {
            int p=1;
            while(n>0)
            {
                int r= (int) (n%10);
                p*=r;
                n/=10;
            }
            System.out.println(p);
        }
        if(c==1)
        {
            int s=0;
            while(n>0)
            {
                int r=(int) (n%10);
                s+=r;
                n/=10;
            }
            System.out.println(s);
        }
    }
}
