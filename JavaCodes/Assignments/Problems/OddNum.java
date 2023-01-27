//Prints the num in odd position as well as the num should be odd.
package vishwa;
import java.util.*;
public class OddNum {
    public static void main(String[] args) {
        Scanner skv = new Scanner(System.in);
        int v = skv.nextInt();
        for(int i=0;i<v;i++)
        {
            int s=skv.nextInt();
            if(s%2==1 && i%2==1) {
                System.out.println(s + " ");
            }
        }
    }
}
