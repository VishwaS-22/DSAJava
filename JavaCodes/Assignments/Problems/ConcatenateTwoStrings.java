package vishwa;
import java.util.*;
public class ConcatenateTwoStrings
{
        public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);
            String str1=in.next();
            String str2=in.next();
            int n=in.nextInt();
            int m=in.nextInt();
            for(int i=0; i<n; i++)
                System.out.print(str1.charAt(i));
            for(int i=str2.length()-m; i<str2.length(); i++)
                System.out.print(str2.charAt(i));
            System.out.println();
            for(int i=0; i<str2.length()-m; i++)
                System.out.print(str2.charAt(i));
            for(int i=n; i<str1.length(); i++)
                System.out.print(str1.charAt(i));
        }
}
