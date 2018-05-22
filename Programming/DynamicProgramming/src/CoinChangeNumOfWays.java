
import java.util.*;
import java.lang.*;
import java.io.*;
class CoinChangeNumOfWays
{
	public static int cc(int[] coins, int sum, int n)
	{
		int[][] dp = new int[sum+1][n];
		
		for(int i=0;i<n;i++)
			dp[0][i] = 1;
		
		int x=0;int y=0;
		for(int i = 1; i<=sum;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=1)
					x = dp[i][j-1];
				
				if(i-coins[j] >= 0)
					y = dp[i-coins[j]][j];
				
				dp[i][j] = x+y;
				x=0;
				y=0;
			}
		}
		
		for(int i = 0; i<=sum;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		return dp[sum][n-1];
		
	}
	
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        int[] coins = new int[n];
	        for(int i=0;i<n;i++)
	            coins[i] = s.nextInt();
	        int sum = s.nextInt();
	        System.out.println(cc(coins, sum, n));
	    }
	 }
}