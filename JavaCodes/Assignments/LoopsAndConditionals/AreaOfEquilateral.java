package vishwa;
import java.util.*;
public class AreaOfEquilateral {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        double res = (Math.sqrt(3)/4)*s*s;
        System.out.print(res);
    }
}
