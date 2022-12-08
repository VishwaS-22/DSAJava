//Printing first and last three bits.

package vishwa;
import java.util.*;
public class ThreeBits {
    public static void main(String[] args) {
        Scanner gg=new Scanner(System.in);
        int n=gg.nextInt();
        String s =Integer.toBinaryString(n);
        System.out.println(s);

        String s1=s.substring(0,3);
        System.out.println(s1);

        String s2=s.substring(s.length()-3);
        System.out.println(s2);

        int t =Integer.parseInt(s1,2);
        int g=Integer.parseInt(s2,2);
        System.out.print(t+" "+g);
    }
}
