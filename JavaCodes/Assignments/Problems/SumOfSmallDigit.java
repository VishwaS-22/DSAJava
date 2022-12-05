package vishwa;
import java.util.*;
public class SumOfSmallDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[100];
        int s=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            int min=10;
            while(arr[i]>0)
            {
                if(arr[i]%10<min) {
                    min = arr[i] % 10;
                }
                arr[i]/=10;
            }
            s+=min;
        }
        System.out.print(s);
    }

}

