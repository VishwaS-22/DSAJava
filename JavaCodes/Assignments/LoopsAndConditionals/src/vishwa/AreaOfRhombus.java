package vishwa;
import java.util.*;
public class AreaOfRhombus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int area = (d1*d2)/2;
        System.out.println(area);

        //Perimeter
        int a = in.nextInt();
        System.out.println(4*a);
    }
}
