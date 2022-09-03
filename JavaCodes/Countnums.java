package vishwa;

import java.util.Scanner;

public class Countnums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        int m=in.nextInt();
        while(n>0){
            if(n%10==m){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
