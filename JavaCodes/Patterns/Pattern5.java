package Patterns;
import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print5(n);
    }
    static void print5(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+(n-i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
