package Patterns;
import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print10(n);
    }
    static void print10(int n){
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int t,d=j,l=(2*n-1)-1-i,r=(2*n-1)-1-j;
                System.out.print(n-Math.min(Math.min(i,j),Math.min(l,r)));
            }
            System.out.println();
        }
    }
}
