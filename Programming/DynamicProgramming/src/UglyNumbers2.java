
import java.util.*;
import java.lang.*;
import java.io.*;
class UglyNumbers2
 {
    public static int ugly(int n)
    {
       Stack<Integer> arr = new Stack<Integer>();
       arr.push(1);
       int i=0,j=0,k=0;
       while(arr.size()<n)
       {
           arr.push(Math.min(arr.get(i)*2, Math.min(arr.get(j)*3, arr.get(k)*5)));
           if(arr.peek() == arr.get(i)*2) i++;
           if(arr.peek() == arr.get(j)*3) j++;
           if(arr.peek() == arr.get(k)*5) k++;
       }
       return arr.peek();
    }
    
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        System.out.println(ugly(n));
	    }
	 }
}