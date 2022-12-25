//Replace CH1 by CH2
package vishwa;
import java.util.*;
public class ReplaceChar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str=sc.next();
            char ch1=sc.next().charAt(0);
            char ch2=sc.next().charAt(0);System.out.println(str.replace(ch1,ch2));
        }
    }
