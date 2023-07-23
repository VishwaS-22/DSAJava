package vishwa;
import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kwh = in.nextDouble();
        double cost = in.nextDouble();
        int days = in.nextInt();
        double b=0;
        if(kwh>0 && cost>0 && days>0)
        {
            b=kwh*cost;
            b/=days;
            System.out.println(b);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
