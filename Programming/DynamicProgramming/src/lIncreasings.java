import java.util.*;
import java.lang.*;
import java.io.*;
class lIncreasings
 {
     public static int lisub(int[] arr, int n)
     {
         int[] dp = new int[n];
         
         for(int i=0;i<n;i++)
        	 dp[i] = 1;
         
         for(int i=1;i<n;i++)
         {
             for(int j=0;j<i;j++)
             {
                 if(arr[i] > arr[j] && dp[i] <= dp[j])
                    dp[i] += 1;
             }
         }
         int max = 0;
         for(int i=0;i<n;i++)
        	 max = Math.max(max, dp[i]);
         
         return max;
     }

	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i] = s.nextInt();
	        }
	        System.out.println(lisub(arr,n));
	    }
	 }
}