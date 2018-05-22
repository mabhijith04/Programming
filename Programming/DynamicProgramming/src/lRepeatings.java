import java.util.*;

class lRepeatings
 {
    public static int lrsub(String str, int n)
    {
        int[][] dp = new int[n+1][n+1];
        for(int i = 1 ;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(str.charAt(i-1) == str.charAt(j-1) && i!=j)
                    dp[i][j] = dp[i-1][j-1]+1;
                else 
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
     
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        s.nextLine();
	        String str = s.nextLine();
	        System.out.println(lrsub(str,n));
	    }
	 }
}