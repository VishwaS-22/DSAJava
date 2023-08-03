package vishwa;
import java.util.*;
public class VolOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double v = (4*Math.PI*r*r*r)/3;
        System.out.println(v);
    }
}
