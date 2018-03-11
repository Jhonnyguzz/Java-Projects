
public class Node {

	public int x;
	public Node next;
	
	public Node(){};
	
	public Node reverse(Node head) {
		
		Node before;
		Node current;
		Node newHead;
		Node top;
		
		int size = 0;
		
		if(head==null)
			return null;
		else if(head.next==null)
			return head;
		else if(head.next.next==null) {
			current = head.next;
			current.next = head;
			head.next = null;
			return current;
		}
		else {
			size = 3;
			before = head.next;
			current = before.next;
			while (true) {
				if(current.next==null) {
					newHead = current;
					top = current;
					current.next = before;
					break;
				}
				
				before = before.next;
				current = before.next;
				size++;
			}
			
			before = head;
			while ( true ) {
				before = before.next;
				current = before.next;
				
				//three left
				if(current == top) {
					current.next = before;
					before.next = head;
					head.next = null;
					break;
				}
				
				if(current.next == top) {
					top = current;
					current.next = before;
					before = head;
				}
				
			}
		}
		return newHead;
	}
}
