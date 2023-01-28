//Print the integers that are ending with 10.

package vishwa;
import java.util.*;
public class LastTwo {
    public static void main(String[] args) {
        Scanner skv = new Scanner(System.in);
        int n = skv.nextInt();
        int v=0;
        for(int i=0;i<n;i++)
        {
            int n1=skv.nextInt();
            if(n1%100==10)
            {
                System.out.println(n1+" ");
                v+=1;
            }
        }
        if(v==0)
        {
            System.out.println(-1);
        }
    }
}
