
public class LinkedList {
	
	node head ;
	
	public LinkedList() {
		
		head = null ;
	}
	
	public node insertion(int value){
		
		node newnode = new node();
		newnode.next = head;
		head= newnode;
		return newnode;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
