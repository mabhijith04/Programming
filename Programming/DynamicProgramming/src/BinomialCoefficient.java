import java.util.*;
import java.lang.*;
import java.io.*;
class BinomialCoefficient
 {
    public static int ncr(int n, int r)
    {
        int[][] dp = new int[n+1][r+1];
        int mod = (int)Math.pow(10,9) + 7;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=Math.min(r,i);j++)
            {
                if(j==0 || j==i)
                    dp[i][j] = 1;
                
                else
                    dp[i][j] = (dp[i-1][j-1]%mod + dp[i-1][j]%mod)%mod;
            }
        }
        return dp[n][r];
    }
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        int r = s.nextInt();
	        System.out.println(ncr(n,r));
	    }
	 }
}