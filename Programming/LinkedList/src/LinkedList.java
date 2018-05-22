public class LinkedList 
{
	public int length = 0;
	Node head;
	
	public LinkedList()
	{
		length = 0;
	}
	
	public Node getHead()
	{
		return head;
	}
	
	public void insertAtBeginning(Node node)
	{
		if(head == null)
			head = node;
		else
		{
			node.setNext(head);
			head = node;
		}
		length++;
	}
	public void insertAtEnd(Node node)
	{
		if(head == null)
			head = node;
		else
		{
			Node p,q;
			for(p=head;(q=p.getNext()) != null; p=q);
			p.setNext(node);
		}
		length++;
	}
	
	public Node deleteBeginning()
	{
		if(head ==null)
		{
			System.out.println("LIST EMPTY");
			return null;
		}
		
		else
		{
			Node temp = head;
			head = head.getNext();
			temp.setNext(null);
			length--;
			return temp;
		}
	}
	
	public void deleteItem(int data)
	{
		Node temp = head;
		if(temp.getData() == data)
			deleteBeginning();
		for(int i=1;i<length-1;i++)
		{
			temp = temp.getNext();
			if(temp.getData()==data)
			{
				delete(i);
				length--;
			}
		}
		if(temp.getNext().getData() == data)
			deleteEnd();
	}
	
	public void delete(int pos)
	{
		if(pos <= 0)
			deleteBeginning();
		else if(pos>=length)
			deleteEnd();
		else
		{
			Node temp = head;
			for(int i=0;i<pos-1;i++)
			{
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
			length--;
		}
	}
	public void insert(int data, int pos)
	{
		Node node = new Node();
		node.setData(data);
		if(pos <= 0) 
			insertAtBeginning(node);
		
		else if(pos >= length)
			insertAtEnd(node);
		
		else
		{
			Node temp = head;
			for(int i=0;i<pos;i++)
			{
				temp = temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
			length+=1;
		}
		
	}
	
	public Node deleteEnd()
	{
		if(head ==null)
		{
			System.out.println("LIST EMPTY");
			return null;
		}
		else
		{
			Node p = head;
			Node q = null;
			Node next = head.getNext();
			
			if(next == null)
			{
				head = null;
				length--;
				return p;
			}
			else
			{
				while((next = p.getNext()) !=null)
				{
					q=p;
					p=next;
				}
				q.setNext(null);
				length--;
				return p;
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
			System.out.println(head.getData());
			Node temp = head.getNext();
			while(temp!=null)
			{
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}
}
