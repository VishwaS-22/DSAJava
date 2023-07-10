package vishwa;
import java.util.*;
public class CopyAllPasteAll {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        String s = ip.next();
        long len = s.length();
        for(int i=0;i<a;i++) len+=len;
        System.out.print(len);
    }
}
