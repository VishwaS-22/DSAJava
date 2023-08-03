//Diff. btw product digits & sum of digits.
package vishwa;
import java.util.*;
public class ProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p=1,s=0;
        while(n>0){
            int r = n%10;
            p*=r;
            s+=r;
            n/=10;
        }
        System.out.println(p-s);
    }
}
