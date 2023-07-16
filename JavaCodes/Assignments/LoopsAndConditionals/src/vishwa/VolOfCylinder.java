package vishwa;
import java.util.*;
public class VolOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double h = in.nextDouble();
        double r = in.nextDouble();
        double v = Math.PI*r*r*h;
        System.out.println(v);
    }
}
