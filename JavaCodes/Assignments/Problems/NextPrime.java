package vishwa;
import java.util.*;
public class NextPrime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong()+1;
        while (!check(n))
        {
            n+=1; //++n
        }
        System.out.println(n);
    }

    static boolean check(long n)
    {
        if (n == 2 || n == 3) return true;
        if (n <= 1 || n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 3; i < Math.sqrt(n); i += 2)
        {
            if (n % i == 0) return false;
        }
        return true;
    }
}

/*
    //Optimized Solution.
    import java.util.*;
    import java.math.*;
    public class NextPrime
    {

        public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);
            long v=in.nextLong();
            BigNumber n=new BigNumber(String.valueOf(l));
            BigNumber nextVal=n.nextProbablePrime();
            System.out.print(nextVal);
	}
}
*/