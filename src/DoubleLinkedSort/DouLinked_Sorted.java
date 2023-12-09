package DoubleLinkedSort;

public class DouLinked_Sorted {
	Node head;
	//Node tail;
	
	class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int val){
			data = val;
			prev = null;
			next = null;
		}
	}
	
	DouLinked_Sorted(){
		head = null;
		//tail = null;
	}
	
	public void insert(int val) {
	
	Node newNode = new Node(val);
	if(head == null) {
		head = newNode;
	}
	else if(val < head.data) {
		newNode.next = head;
        head.prev = newNode;
        head = newNode;
	}
	else {
        // Traverse the list to find the correct position for the new node
        Node current = head;

        while (current.next != null && current.next.data < val) {
            current = current.next;
        }

        // Insert the new node
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
    }

}
	public void display() {
		if(head==null) {
			System.out.println("list is Empty");
		}
		Node temp = head;         //start from head
		while(temp!=null) {  
			System.out.println(temp.data+" ");
				temp = temp.next;
			}
			
				
		}
}
	

	
//	public void insertpos(int pos,int val) {
//		if(pos==0) {
//			insert(val);
//			return;
//		}
//
//	}
//	}
	
		
		//Node newNode = new Node(val);
		
		//Node temp = head;
//		for(int i=1;i<pos;i++) {
//			temp=temp.next;
//			if(temp==null) {
//				throw new IndexOutOfBoundsException("Invaild pos "+pos);
//			}
//		}
//		
//		newNode.next = temp.next;          //1st<-(V.I)--temp.next odatha newNode.next la store panni vachikirom
//		temp.next = newNode;               //2nd<-(V.I)--newNode la temp.next ta store pantrom
		
		
//}
