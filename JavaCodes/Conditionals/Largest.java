//Largest of 3 numbers.
package vishwa;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int a=in.nextInt();

        int b=in.nextInt();
        int c=in.nextInt();
        /*

        int max=a;
        if(b>max){
            max=b;
        }else{
            max=a;
        }
        if(c>max){
            max=c;
        }
        */
        int max=Math.max(c,Math.max(a,b)); //Optimized Solution.
        System.out.println(max);

    }
}
