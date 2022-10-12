//Swapping unit digits of 2numbers.

package vishwa;
import java.util.*;
public class UnitDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = in.nextInt();
        int a = n % 10;
        int b = n1 % 10;

        n/=10;
        n1/=10;
        n*=10; //n=(n*10)+b;
        n1*=10;//n1=(n1*10)+a;
        System.out.print((n+b)+" "+(n1+a));

    }
}