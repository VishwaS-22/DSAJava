package vishwa;

import java.util.Scanner;

public class Numreverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(); // 12345
        int ans=0;
        while(n>0){    // true
            int rem=n%10; // 12345%10 = 5
            n/=10; // 1234
            ans=ans*10+rem; // 0*10+5=5
        }
        System.out.println(ans); //5 .....
    }
}
