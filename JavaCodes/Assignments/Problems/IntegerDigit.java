package vishwa;
import java.util.*;
public class IntegerDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            int j=i;
            while(j>0){
                int a=j%10;
                if(a==x){
                    System.out.print(i+" ");
                    count++;
                    break;
                }
                j/=10;
            }
        }
        if(count==0){
            System.out.print(-1);
        }
    }
}
