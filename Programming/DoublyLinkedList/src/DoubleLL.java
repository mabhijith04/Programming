
public class DoubleLL 
{
	Node head;
	int length = 0;
	public void insertBeginning(int data)
	{
		Node node = new Node(data);
		if(head == null)
			head = node;
		else
		{
			node.right = head;
			head.left = node;
			head = node;
		}
		length++;
	}
	
	
	public void printListReverse()
	{
		if(head==null)
		{
			System.out.println("LIST EMPTY");
		}
		else
		{
			Node temp = head;
			for(int i=0;i<length;i++)
			{
				temp = temp.right;
			}
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp = temp.right;
			}
		}
	}
	
	public void printList()
	{
		if(head==null)
		{
			System.out.println("LIST EMPTY");
		}
		else
		{
			System.out.println(head.data);
			Node temp = head.right;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp = temp.right;
			}
		}
	}
	
}
