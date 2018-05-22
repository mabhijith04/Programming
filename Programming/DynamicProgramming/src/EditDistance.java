
import java.util.*;
import java.lang.*;
import java.io.*;
class EditDistance
{
	public static int editDistance(String s1, int n, String s2, int m)
	{
		int[][] dp = new int[n+1][m+1];
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				if(i==0)
					dp[i][j] = j;
				else if(j==0)
					dp[i][j] = i;
				
				else if(s1.charAt(i-1) == s2.charAt(j-1)) 
					dp[i][j] = dp[i-1][j-1];
				
				else 
				{
					dp[i][j] = 1+ Math.min(dp[i-1][j], 
								  Math.min(dp[i][j-1], 
										   dp[i-1][j-1]));
				}
			}
		}
		return dp[n][m];
		
	}
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        int m = s.nextInt();
	        
	        String s1 = s.next();
	        String s2 = s.next();

	        System.out.println(editDistance(s1, n, s2, m));
	    }
	 }
}