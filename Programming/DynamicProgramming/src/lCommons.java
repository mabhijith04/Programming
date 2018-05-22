import java.util.*;
import java.lang.*;
import java.io.*;
class lCommons
 {
	public static void lcsString(int dp[][], String s1,String s2, int n, int m)
	{
		int index = dp[n][m];
		int temp = index;
		char[] lcs = new char[index+1];
		lcs[index] = '\0';
		int i=n;
		int j=m;
		while(i >0 && j >0)
		{
			if(s1.charAt(i-1) == s2.charAt(j-1))
			{
				lcs[index-1] = s1.charAt(i-1);
				i--;
				j--;
				index--;
			}
			else if(dp[i][j-1] > dp[i-1][j])
				j--;
			else
				i--;
		}
		System.out.print("LCS of "+s1+" and "+s2+" is ");
        for(int k=0;k<=temp;k++)
            System.out.print(lcs[k]);
	}
	
    public static int lcsub(String s1, String s2)
    {
    	
    	int m = s1.length();
    	int n = s2.length();
    	int[][] dp = new int[m+1][n+1];
    	
    	for(int i =0;i<=m;i++)
    	{
    		for(int j=0;j<=n;j++)
    		{
    			if(i==0 || j==0)
    				dp[i][j] = 0;
    			else if(s1.charAt(i-1) == s2.charAt(j-1))
    				dp[i][j] = 1 + dp[i-1][j-1];
    			else 
    				dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
    		}
    	}	
    	lcsString(dp,s1,s2,m,n);
    	return dp[m][n];
    }
    
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	    	int p = s.nextInt();
	    	int q = s.nextInt();
	    	s.nextLine();
	        String s1 = s.nextLine();
	        String s2 = s.nextLine();
	        int n = s1.length();
	        int m = s2.length();
	        int[][] dp = new int[n+1][m+1];
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=m;j++)
                    dp[i][j] = -1;
            }
	        System.out.println(lcsub(s1,s2));
	    }
	 }
}