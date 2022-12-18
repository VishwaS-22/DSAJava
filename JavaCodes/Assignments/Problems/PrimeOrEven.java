//Print Valid if num is either prime or odd else Invalid.
package vishwa;
import java.util.*;
public class PrimeOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==0){
            System.out.println("Valid");
        }
        if(n%2==1){
            int c=2,k=0;
            while(c<n){
                if(n%c==0){
                    k=1;
                }
                c+=1;
            }
            if(k==1){
                System.out.println("Invalid");
            }
            else{
                System.out.println("Valid");
            }
        }
    }
}
