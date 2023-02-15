import java.util.*;
public class ZeroSumColumns{

    public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0; i<n; i++)
		{
		    for(int j=0; j<n; j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		for(int i=0; i<n; i++)
		{
		    int sum=0;
		    for(int j=0; j<n; j++)
		    {
		       sum+=a[j][i]; 
		    }
		    if(sum!=0)
		    {
		        System.out.print("no");
		        System.exit(0);
		    }
		}
		System.out.print("yes");

	}
}
