//Curved Surface Area of a Cylinder.
package vishwa;
import java.util.*;
public class CSAOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double h = in.nextDouble();
        double v = 2*Math.PI*r*h;
        System.out.println(v);
    }
}
