package vishwa;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,max=0,t;
        do {
            n=in.nextInt();
            t=n;
            if(t>max){
                max=t;
            }
        }while(n!=0);
        System.out.println(max);
    }
}
