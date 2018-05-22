import java.util.Scanner;

public class LargestSumContiguousSubarray 
{
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        int sum = 0;
	        int maxnow = Integer.MIN_VALUE;
	        for(int i=0 ; i<n ; i++)
	        {
	            sum = sum + s.nextInt();
	            maxnow = Math.max(sum, maxnow);
	            if(sum < 0)
	                sum = 0;
	        }
	        System.out.println(maxnow);
	    }
	 }
}
