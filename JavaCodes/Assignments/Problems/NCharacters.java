// Print the first and last n characters.

package vishwa;
import java.util.*;
public class NCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String str = in.next();
        System.out.println(str.substring(0,n));
        System.out.println(str.substring(str.length()-n));
    }
}
