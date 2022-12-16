//Compare two strings and print which one has more consonants.
package vishwa;
import java.util.*;
public class CompareString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int c=0,c1=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u')
            {
                c++;
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u')
            {
                c1++;
            }
        }
        if(c==c1)
        {
            if(s1.length()>s2.length())
            {
                System.out.println(s1);
            }
            else {
                System.out.println(s2);
            }
        }
        else if(c>c1)
        {
            System.out.println(s1);
        }
        else
        {
            System.out.println(s2);
        }
    }
}
