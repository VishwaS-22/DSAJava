package vishwa;
import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r=0;
        for(int i=1;i<=n;i++)
        {
            r+=i;
        }
        System.out.println(r/n); // avg of n nums.
    }
}
