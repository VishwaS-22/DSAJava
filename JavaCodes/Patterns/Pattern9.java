package Patterns;
import java.util.*;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print9(n);
    }
    static void print9(int n){
        int s = 2*n-2; //spaces
        for(int i=1;i<=2*n-1;i++)
        {
            int s1=i; //star
            if(i>n)s1=2*n-i;
            for(int j=1;j<=s1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=s1;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n)s-=2;
            else s+=2;
        }
    }
}
