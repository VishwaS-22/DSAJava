package vishwa;
import java.util.*;
public class VolOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l = in.nextDouble();
        double w = in.nextDouble();
        double h = in.nextDouble();
        double v = (l*w*h)/3;
        System.out.println(v);

    }
}
