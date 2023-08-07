package Patterns;
import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print6(n);
    }
    static void print6(int n1){
        for(int i=0;i<n1;i++){
            char c = (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
