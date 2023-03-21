//Program must print first & last X characters - Two string values
import java.util.*;
public class Hello 
{

    public static void main(String[] args) 
    {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String n = sc.nextLine();
        int x = sc.nextInt();
        System.out.print(m.substring(0, x) + n.substring(n.length() - x));
	}
}
