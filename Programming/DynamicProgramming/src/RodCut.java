import java.util.Scanner;

public class RodCut 
{
	public static int rodCut(int[] arr, int n)
	{
		int[] dp= new int[n+1];
		dp[0] = 0;
		
		for(int i=1;i<=n;i++)
		{
			int max = Integer.MIN_VALUE;
			for(int j=0;j<i;j++)
				max = Math.max(max, arr[j] + dp[i-j-1]);
			dp[i] = max;
		}
		return dp[n];
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			int n = s.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = s.nextInt();
			System.out.println(rodCut(arr, n));
		}
	}
}
