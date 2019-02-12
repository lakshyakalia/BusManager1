class Node{
	Node pre;

	int data;

	Node next;

	Node(int data){

		this.data=data;
		this.pre=null;
		this.next=null;
	}

}

class DoublyList{

	Node head;
	Node tail;

	public void traverse(){

		if(head==null)
		{
			System.out.print("list is empty");
		}
		else{
			Node current;
			current=head;
			while(current!=null){
				System.out.println(current.data);
				current=current.next;
			}
		}
	}

	public void traverseReverse(){
		if(tail==null)
		{
			System.out.print("list is empty");
		}
		else{
			Node current;
			current=tail;
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.pre;
			}
		}
	}
	public void insertBeg(int data)
	{
		Node node=new Node(data);

		if(head==null){
			head=node;
			tail=node;

		}
		else
		{
			head.pre=node;

			node.next=head;
			head=node;
		}
	}
	public void insertEnd(int data)
	{
		Node node =new Node(data);
		if(head==null){
			head=node;
			tail=node;
		
		}
		else{
			tail.next=node;
			node.pre=tail;
			tail=node;
		}
	}
	public void deleteBeg()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else{
		Node cur=head;
		if(head==tail){
			tail=null;
		}
		else{
			head.next.pre=null;
		}
		head=head.next;
		cur.next=null;
		}
	}
	public void deleteEnd()
	{
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			Node cur=tail;
			if(head==tail){
				head=null;
			}
			else{
				tail.pre.next=null;
			}
			tail=tail.pre;
			cur.pre=null;
		}
	}
}

public class DoubleLL{
	public static void main(String[] x)
	{
		DoublyList list=new DoublyList();

		list.insertBeg(10);
		list.insertBeg(20);
		list.insertBeg(30);
		list.insertBeg(40);
		list.insertBeg(50);
		list.insertEnd(60);
		list.traverse();
		list.deleteBeg();
		list.deleteEnd();
		list.traverse();
	}


}