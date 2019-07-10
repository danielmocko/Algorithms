package recursion;

public class LinkedList {
	static Node head=null;
	
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
		
		printList(list);
		
		list.deleteAtPosition(list, 10);
		
		printRecursive(head);
	}
	
	static class Node{
		int data =0; 
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public static LinkedList insert(LinkedList list,int data) {
		Node new_node = new Node(data);
		new_node.next=null;
		
		if(list.head==null)
			list.head=new_node;
		else {
			Node last = list.head;
			while(last.next!=null)
				last=last.next;
			
			last.next=new_node;
		}
		return list;
	}
	
	public static LinkedList delete (LinkedList list, int key) {
		Node currNode = list.head;
		Node prev = null;
		
		
		//Case 1:  If the key is somewhere other than at head 
		if(currNode!=null && currNode.data==key) {
			list.head=currNode.next;
			System.out.println(key+ " founded and deleted");
		
			return list;
		}
		// CASE 2: If the key is somewhere other than at head 
		
		while(currNode!=null && currNode.data!=key) {
			prev=currNode;
			currNode=currNode.next;
		}
		if(currNode!=null) {
			prev.next=currNode.next;
			System.out.println(key + " founded and deleted");
		}
		
		// CASE 3: The key is not present 
		if(currNode==null)
			System.out.println(key+" not found");
		
		return list;
	}
	
	
	public static void printList(LinkedList list) {
		Node currNode = list.head;
		
		while(currNode!=null) {
			System.out.print(currNode.data+ " ");
			currNode=currNode.next;
		}
		System.out.println();
	}
	
	public static LinkedList deleteAtPosition (LinkedList list, int position) {
		Node currNode = list.head;
		Node prev = null;
		
		if(position==0 && currNode!=null) {
			list.head=currNode.next;
			System.out.println("Element on position "+ position+" is deleted");
			
			return list;
		}
		
		int i=0;
		while(currNode!=null && i!=position) {
			prev=currNode;
			currNode=currNode.next;
			i++;
		}
		
		if(currNode!=null ) {
			prev.next=currNode.next;
			System.out.println("Element on position "+ position+" is deleted");
		}
		
		if(currNode==null)
			System.out.println("Position " + position + " not found");
		
		return list;
	}
	
	public static void printRecursive(Node head) {
		if(head!= null) {
			System.out.print(head.data+ " ");
			if(head.next!=null)
				printRecursive(head.next);
		}
		
	}
	
	
	
}