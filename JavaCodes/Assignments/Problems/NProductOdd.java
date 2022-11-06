package vishwa;

import java.util.*;
        public class NProductOdd
        {
            public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int temp = n;
                int max = 0;
                int s = 0;
                while (n > 0)
                {
                    if ((n % 10) % 2 != 0 && n % 10 > max)
                    {
                        max = n % 10;
                        s = 1;
                    }
                    n /= 10;
                }
                if (s == 1)
                    System.out.print(temp * max);
                else
                {
                    System.out.print(-1);
                }
            }
        }
