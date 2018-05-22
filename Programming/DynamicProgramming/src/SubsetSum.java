import java.util.Scanner;

public class SubsetSum 
{
	public static boolean subsetSum(int[] arr, int n, int sum)
	{
		boolean dp[][] = new boolean[sum+1][n+1];
		
		for(int i=0;i<=n;i++)
			dp[0][i] = true;
		
		for(int i=1;i<=sum;i++)
			dp[i][0] = false;
		
		for(int i=1;i<=sum;i++)
		{
			for(int j=1;j<=n;j++)
			{
				dp[i][j] = dp[i][j-1];
				if(i >= arr[j-1])
					dp[i][j] = dp[i][j] || dp[i-arr[j-1]][j-1];
			}
		}
		return dp[sum][n];
		
	}
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        int[] arr = new int[n];
	        int sum = s.nextInt();
	        for(int i = 0;i<n;i++)
	        	arr[i] = s.nextInt();
	        System.out.println(subsetSum(arr, n, sum));
	    }
	 }

}
