package vishwa;
import java.util.*;
public class SumOfAll {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,s=0;
        do{
            n=in.nextInt();
            s+=n;
        }
        while(n!=0);
        System.out.println(s);
    }
}
