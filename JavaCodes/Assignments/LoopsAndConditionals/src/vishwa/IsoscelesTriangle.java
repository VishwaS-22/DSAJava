package vishwa;
import java.util.*;
public class IsoscelesTriangle //Isosceles is nothing but all sides 've to be equal.
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int b,h;
        b=in.nextInt();
        h=in.nextInt();
        double area=(b*h)/2;
        System.out.print(area);
    }
}
