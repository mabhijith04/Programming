
public class Driver 
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		int n= 10;
		for(int i=0;i<n;i++)
		{
			Node n1 = new Node();
			n1.setData(i);
			list.insert(i,i-1);
		}
		list.deleteItem(5);
		list.printList();
		
	}
}
