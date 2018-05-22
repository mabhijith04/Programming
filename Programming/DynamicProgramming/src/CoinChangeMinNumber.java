import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeMinNumber 
{
	public static void printCoinCombination (int R[], int coins[]) 
	{
        if (R[R.length - 1] == -1) 
        {
            System.out.print("No solution is possible");
            return;
        }
        int start = R.length - 1;
        System.out.print("Coins used to form total ");
        while ( start != 0 ) 
        {
            int j = R[start];
            System.out.print(coins[j] + " ");
            start = start - coins[j];
        }
        System.out.print("\n");
    }

	public static int cc(int coins[], int sum, int n)
	{
		int[] dp = new int[sum+1];
		int[] getCoin = new int[sum+1];
		
		dp[0] = 0;
		for(int i=1;i<=sum;i++)
		{
			dp[i] = Integer.MAX_VALUE - 1;
			getCoin[i] = -1;
		}
		
		for(int j=0; j < coins.length; j++)
		{
            for(int i=1; i <= sum; i++)
            {
            	if(i >= coins[j])
            	{
            		if(dp[i-coins[j]]+1 < dp[i])
            		{
            			dp[i] = dp[i-coins[j]]+1 ;
            			getCoin[i] = j;
            		}
            	}
            }
		}
		//printCoinCombination(getCoin, coins);
		return dp[sum];
	}
	
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int sum = s.nextInt();
	        int n = s.nextInt();
	        int[] coins = new int[n];
	        for(int i=0;i<n;i++)
	            coins[i] = s.nextInt();
	        int res = cc(coins, sum, n);
	        if(res == Integer.MAX_VALUE-1)
	        	System.out.println(-1);
	        else
	        	System.out.println(res);
	    }
	 }

}
