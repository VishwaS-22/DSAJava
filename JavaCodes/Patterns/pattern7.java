package Patterns;
import java.util.*;
public class pattern7 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        print7(n);
    }
    static void print7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }

            char c='A';
            int p=(2*i+1)/2;
            //System.out.println(p);

            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(c);
                if(j<=p) c++;
                else c--;
            }
                for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
