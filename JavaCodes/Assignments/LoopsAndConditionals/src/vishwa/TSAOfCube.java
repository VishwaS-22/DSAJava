//Total surface area of a cube.
package vishwa;
import java.util.*;
public class TSAOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        int res = 6*side*side;
        System.out.println(res);
    }
}
