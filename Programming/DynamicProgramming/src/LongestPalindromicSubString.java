import java.util.*;

public class LongestPalindromicSubString 
{
	public static String lps(String str)
	{
		int n = str.length();
		boolean dp[][] = new boolean[n][n];
		int max = 1;
		for(int i=0;i<n;i++)
			dp[i][i] = true;
		 
		int start = 0;
	    for (int i = 0; i < n - 1; ++i) 
	    {
	    	if (str.charAt(i) == str.charAt(i + 1)) 
	    	{
	    		dp[i][i + 1] = true;
	    		start = i;
	    		max= 2;
	    	}
	    }
		
	    for(int i=3; i<=n;i++)
	    {
	    	for(int j = 0; j<n-i+1;j++)
	    	{
	    		int k = i+j-1;
	    		if(dp[j+1][k-1] && str.charAt(j) == str.charAt(k))
	    		{
	    			dp[j][k] = true;
	    			if(i > max)
	    			{
	    				start = j;
	    				max = i;
	    			}
	    		}
	    	}
	    }
	    return str.substring(start, start+max);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(lps(str));
	}
	

}
