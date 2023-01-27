//Prints next integer that has unit digit as 2.
package vishwa;
import java.util.*;
public class NextUnitDigit {
    public static void main(String[] args) {
        Scanner skv = new Scanner(System.in);
        int n=skv.nextInt();
        int c=0;
        if(n%10==2)
        {
            System.out.print(n+10);
            c++;
        }
        if(c==0)
        {
            for(int i=n;i<=n+10;i++)
            {
                int r=i%10;
                if(r==2)
                {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}
