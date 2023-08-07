package Patterns;
import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        print8(n);
    }
    static void print8(int n){
        int is=0;
        for(int i=0;i<n;i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < is; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            is+=2;
            System.out.println();
        }
        is=(2*n)-2;
        for(int i=0;i<n;i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < is; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            is-=2;
            System.out.println();
        }
    }
}
