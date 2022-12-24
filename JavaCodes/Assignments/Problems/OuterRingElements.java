package vishwa;
// JAVA Code for Boundary elements of a Matrix
import java.util.*;
public class OuterRingElements {

    public static void printBoundary(int a[][], int m, int n)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print(a[i][j] + " ");
                else if (i == m - 1)
                    System.out.print(a[i][j] + " ");
                else if (j == 0)
                    System.out.print(a[i][j] + " ");
                else if (j == n - 1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=in.nextInt();
            }
        }
        // Function call
        printBoundary(a,n,m);
    }
}

