// Reversing the last x characters in the string.

package vishwa;
import java.util.*;
public class ReverseNChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = in.nextInt();
        int l = str.length();
        System.out.print(str.substring(0,l-n));
        String str1 = str.substring(l-n);
        String rev="";
        char ch;
        for(int i=0;i<str1.length();i++)
        {
            ch=str1.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
    }
}
