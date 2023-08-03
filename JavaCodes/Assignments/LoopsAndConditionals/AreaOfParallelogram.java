package vishwa;
import java.util.*;
public class AreaOfParallelogram {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int b = ip.nextInt();
        int h = ip.nextInt(); //height
        int area=b*h;
        System.out.println(area);

        //Perimeter
        //base(b) & side(h)
        System.out.println(2*(b+h));
    }
}
