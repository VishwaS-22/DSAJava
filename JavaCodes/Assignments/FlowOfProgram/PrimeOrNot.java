package vishwa;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num,i;
        num=in.nextInt();

        if(num<=1)
        {
            System.out.print("Not a Prime Number.");
        }
        for(i=2;i<Math.sqrt(num);i++)
        {
            if(num%2==0)
            {
                System.out.print("Not a Prime Number.");
                break;
            }
        }
        System.out.print("Prime Number.");

        //System.out.println("\n");
        /*
        //Optimized One.
        i=2;
        while(i<num)
        {
            if(num%i==0)
            {
                System.out.println("Not Prime.");
                break;
            }
            i=i+1;
        }
        System.out.println("Prime");
        */



    }
}
