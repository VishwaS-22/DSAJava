package vishwa;
import java.util.*;
public class VolOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double h = in.nextDouble();
        double r = in.nextDouble();
        //double pi = 3.14;
        double v = (Math.PI*r*r)*h/3;
        System.out.println(v);
    }
}
