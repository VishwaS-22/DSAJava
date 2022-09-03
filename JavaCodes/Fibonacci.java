//Print nth number in the fibonacci series.
package vishwa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int i=0;
        int j=1;
        int count = 2;

        while(count<=n) {
            int temp = j;
            j = j + i;
            i = temp;
            count++;
        }
        System.out.println(j);
    }
}
