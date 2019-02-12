class Node{
	Node pre;
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.pre=null;
		this.next=null;
	}
}
class linklist{
	Node head;
	public void insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
        }
        else
        {
        	Node current;
        	current=head;
        	while(current.next!=null)
        	{
        		current=current.next;
        	}
        	current.next=node;

        }

	}
	public void fun()
	{
		Node current;
		Node cur;
		int flag=0;
		current=head;
		cur=current.next;
		while(current.next!=null)
{
		while(cur.next!=null && flag!=1)
		{
			if((current.data+cur.data)==0)
			{
				delNode(current);
				flag=1;
				delNode(cur);
				cur=current.next;

			}
			
			cur=cur.next;
		}

		current=current.next;


}
	}
	public void delNode(Node node)
	{
		Node temp = node.next;
    node.data = node.next.data;
    node.next = temp.next;




	}
	public void traverse()
	{
		
	    if(head==null)
	    {
	    	System.out.println("List is Empty");
	    }
	    else{
	    	Node tra;
	    	tra=head;
	    	while(tra!=null)
	    	{
	    		System.out.println(tra.data);
	    		tra=tra.next;
	    	}
	    }
	}

}




public class dsPro{
	public static void main(String[] args) {
		linklist ll=new linklist();
		ll.insert(10);
		ll.insert(20);
		ll.insert(-10);
		ll.insert(-20);
		ll.insert(-60);
		ll.insert(60);
		ll.fun();
		ll.traverse();


		
	}
}