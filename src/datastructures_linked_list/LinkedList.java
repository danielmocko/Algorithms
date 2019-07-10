package datastructures_linked_list;

public class LinkedList {

	public static Node head =null;

	public static void main (String [] args) {


		LinkedList list = new LinkedList();
		
		list.insert(list, 5);
		list.insert(list, 7);
		list.insert(list, 3);
		list.insert(list, 9);
		list.insert(list, 2);
		list.insert(list, 6);
		list.insert(list, 5);
		list.insert(list, 8);
		list.insert(list, 1);
		list.insert(list, 4);
		 /*
		list.insert(list, 6);
		list.insert(list, 2);
		list.insert(list, 7);
		list.insert(list, 4);
*/
		printRecursion(head);

		//reverseOrder(list);
		//printRecursion(head);
		int position = searchElementByID(list, 2);
		System.out.println("Element is founded on " + position );
	}


	public static LinkedList insert (LinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next=null;
		if(list.head==null) {
			list.head=newNode;
			return list;
		}else {
			Node current =list.head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
		return list;
	}

	public static void printRecursion(Node node) {
		if(node!=null) {
			System.out.print(node.data+" ");
			if(node.next!=null)
				printRecursion(node.next);
			else
				System.out.println();
		}
	}

	public static LinkedList reverseOrder (LinkedList list) {
		Node current = list.head; 
		Node prev=null;

		while(current.next!=null) {
			Node next = current.next;
			current.next=prev;
			prev= current;
			current=next;
		}
		current.next = prev;
		list.head=current;


		return list;
	}
	
	public static int searchElementByID(LinkedList list, int element) {
		int position=0;
		if(list.head==null)
			return -1;
		
		Node curent = list.head;
		
		while(curent.next!=null)
		{
			if(curent.data==element) {
				return position;
			}
			position++;
			curent=curent.next;
		}
		
		return -1;
		
		
	
	}
}
