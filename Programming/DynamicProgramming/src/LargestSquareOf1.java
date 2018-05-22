
import java.util.*;

class LargestSquareOf1 
{
	public static int largeSquare(int[][] arr, int n, int m) 
	{
		int[][] dp = new int[n][m];
		int max = 0;
		for(int i=0;i<n;i++)
		{
			dp[i][0] = arr[i][0];
			if(dp[i][0] == 1)
				max =1;
		}
		
		for(int i=0;i<m;i++)
		{
			dp[0][i] = arr[0][i];
			if(dp[0][i] == 1)
				max = 1;
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<m;j++)
			{
				if(arr[i][j] == 0)
					dp[i][j] = 0;
				else
					dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
				max = Math.max(dp[i][j], max);
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			int[][] arr = new int[n][m];
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < m; j++) 
				{
					arr[i][j] = s.nextInt();
				}
			}
			System.out.println(largeSquare(arr, n, m));
		}
	}
}
