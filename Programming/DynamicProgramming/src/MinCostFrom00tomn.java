
import java.util.*;
import java.lang.*;
import java.io.*;

class MinCostFrom00tomn
 {
	public static int minCost(int[][] arr, int r, int c)
	{
		int dp[][] = new int[r+1][c+1];
		
		dp[0][0] = arr[0][0];
		for(int i = 1 ;i<=r;i++)
			dp[i][0] = dp[i-1][0] + arr[i][0];
		
		for(int i = 1 ;i<=c;i++)
			dp[0][i] = dp[0][i-1] + arr[0][i];
		
		for(int i=1;i<=r;i++)
            for(int j=1;j<=c;j++)
            	dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + arr[i][j];
		
		return dp[r][c];
	}
	
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        int[][] arr = new int[n][n];
	        for(int i=0;i<n;i++)
	            for(int j=0;j<n;j++)
	                arr[i][j] = s.nextInt();
	        int r = s.nextInt();
	        int c = s.nextInt();
	        System.out.println(minCost(arr, r, c));
	    }
	 }
}
