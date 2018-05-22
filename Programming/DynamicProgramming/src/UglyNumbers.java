
public class UglyNumbers 
{
	public boolean isUgly(int num) 
	{
		boolean[] arr = new boolean[num + 1];

		arr[0] = false;
		arr[1] = false;
		for (int i = 2; i <= num; i++) 
		{
			if (i % 2 == 0)
				arr[i] = true;
			else if (i % 3 == 0)
				arr[i] = true;
			else if (i % 5 == 0)
				arr[i] = true;
		}

		return arr[num];
	}
}
