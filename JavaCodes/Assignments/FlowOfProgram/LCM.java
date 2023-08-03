package vishwa;
import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        //int n1=15;
        //int n2=20;
        int res=lcm(n1,n2);
        System.out.println(res);
        //int res1=gcd(n1,n2);
        //System.out.println(res1);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    static int gcd(int m,int n){
        if(m==0)
            return n;
        return gcd(n%m,m);
    }
}
