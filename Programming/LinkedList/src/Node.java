public class Node 
{
	private int data;
	private Node next;
	
	void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setNext(Node node)
	{
		this.next = node;
	}
	
	public Node getNext()
	{
		return this.next;
	}
}
