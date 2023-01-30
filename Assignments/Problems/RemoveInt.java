//Remove every second integer.
package vishwa;
import java.util.*;
public class RemoveInt {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
                int d=sc.nextInt();
                int a[]=new int[d];
                for(int i=0;i<d;++i){
                    a[i]=sc.nextInt();
                }
                for(int i=0;i<d;i+=2){
                    System.out.print(a[i]+" ");
                }
    }
}
