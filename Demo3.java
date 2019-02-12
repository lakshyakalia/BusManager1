class Node{
	int data;
	Node next;

	Node(int data){
		this.data=data;
	}
}

class linklist{

	Node head;

	public void insertEnd(int data){
		Node node = new Node(data);

		if(head==null)
		{
			head = node;
		}
		else{

			Node current;
			current=head;

			while(current.next!=null)
			{
				current=current.next;
			}

			current.next=node;
		}
	}

	public void insertBeg(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;

		}
		else
		{
			node.next=head;
			head=node;
		}

	}
	public void traverse()
	{
		int count=0;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else{

	    Node current;
	    current=head;
	   System.out.println("List elements are:");
	    while(current!=null)
	    {
	    	System.out.println(current.data);
	    	current=current.next;
	    	count++;
	    		
	    	
	    }
		}
		
	}
	public void recursion(Node current)
	{
		
		if (current.next!=null) {
			recursion(current.next);
			
		}
		
		System.out.println(current.data);
	}
	
	public void insert_at_specific(int pos,int data)
	{
		Node temp;
		temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			if(count==pos-1)
			{
				Node lol=new Node(data);
				lol.next=temp.next;
				temp.next=lol;

			}
			temp=temp.next;

		}

	}
	public void delete_begin()
	{
		Node temp;
		temp=head;
		if(head==null)
		{
			System.out.print("List is empty");
		}
		else{
			head=temp.next;
			temp.next=null;


		}
		
	}
	public void delete_End()
	{
		if(head==null)
		{
			System.out.print("List is empty");
		}
		else
		{
			Node current;
			Node pre;

			pre=head;
			current=head.next;

			while(current.next != null)
			{
				pre=pre.next;
				current=current.next;
			}
			pre.next=null;
		}
	}
}



public class Demo1{
	public static void main(String[] x){
		linklist list=new linklist();

		list.insertEnd(10);
		list.insertEnd(20);
		list.insertEnd(30);
		list.insertEnd(40);
		list.insertEnd(50);
		list.insertEnd(60);
	
		list.insert_at_specific(4,90);
		list.delete_End();
		list.traverse();
	}
}