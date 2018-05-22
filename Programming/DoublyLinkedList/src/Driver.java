
public class Driver 
{
	public static void main(String[] args)
	{
		DoubleLL list = new DoubleLL();
		
		int n= 10;
		for(int i=0;i<n;i++)
		{
			Node n1 = new Node();
			list.insertBeginning(i);
		}
		list.printList();
		
	}
}
