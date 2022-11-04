package vishwa;
import java.util.*;
public class AreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int r;
        double p,area;
        r=in.nextInt();
        p= 3.14;
        area= r*r*p;
        System.out.print(area);
    }
}
