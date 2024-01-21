package vishwa;
import java.util.*;
/*
Input : n = 5
Output:
*
* *
* * *
* * * *
* * * * *
*/
public class RightTraiangelPattern
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int V = input.nextInt();

        for(int i=1;i<=V;i++){

            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
