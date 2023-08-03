package vishwa;
import java.util.*;
public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int base = in.nextInt();
        double area = (height*base)/2;
        System.out.print(area);
    }
}
