import java.util.Hashtable;

public  class CopyLinkedList {
	
	
      // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class LinkedListNode {
   
        int data;
        LinkedListNode next;
        LinkedListNode arbitrary_pointer;
   
        // Constructor
        LinkedListNode(int d)
        {
            data = d;
            next = null;
        }
        
        // Constructor
        LinkedListNode(int d, LinkedListNode one, LinkedListNode two)
        {
            data = d;
            next =  one;
            arbitrary_pointer =  two;
        }
        
        //display() will display all the nodes present in the list    
        public static void display(LinkedListNode head) {    
            //Node current will point to head    
        	LinkedListNode current = head;    
                
            if(head == null) {    
                System.out.println("List is empty");    
                return;    
            }    
            System.out.println("Nodes of singly linked list: ");    
            while(current != null) {    
                //Prints each node by incrementing pointer    
                System.out.print(current.data + " ");    
                current = current.next;    
            }    
            System.out.println();    
        }    
    }
    
	  public static LinkedListNode deep_copy_arbitrary_pointer(
	        LinkedListNode head) {

	      if (head == null) {
	        return null;
	      } 

	      LinkedListNode current = head;
	      LinkedListNode new_head = null;
	      LinkedListNode new_prev = null;
	      Hashtable<LinkedListNode, LinkedListNode> map = 
	        new Hashtable<LinkedListNode,LinkedListNode>();

	      // create copy of the linked list, recording the corresponding
	      // nodes in hashmap without updating arbitrary pointer
	      while (current != null) {
	        LinkedListNode new_node = new LinkedListNode(
	          current.data);

	        // copy the old arbitrary pointer in the new node
	        new_node.arbitrary_pointer = current.arbitrary_pointer;

	        if (new_prev != null) {
	          new_prev.next = new_node;
	        }
	        else {
	          new_head = new_node;
	        }

	        map.put(current,new_node);

	        new_prev = new_node;
	        current = current.next;
	      }

	      LinkedListNode new_current = new_head;

	      // updating arbitrary_pointer
	      while (new_current != null) {
	        if (new_current.arbitrary_pointer != null) {
	          LinkedListNode node = 
	            map.get(new_current.arbitrary_pointer);

	          new_current.arbitrary_pointer = node;
	        }

	        new_current = new_current.next;
	      }

	      return new_head;
	    }
	    /// Test Program.
	    public static void main(String[] args) {
	      LinkedListNode node3 = new LinkedListNode(
	        3, null, null);
	      LinkedListNode node2 = new LinkedListNode(
	        2, node3, null);
	      LinkedListNode node1 = new LinkedListNode(
	        1, node2, node3);
	      LinkedListNode list_head = new LinkedListNode(
	        0, node1, node2);

	      LinkedListNode list_head_2 = 
	      deep_copy_arbitrary_pointer(list_head);

	      System.out.print("Original: ");
	      LinkedListNode.display(list_head);

	      System.out.print("Copied: ");
	      LinkedListNode.display(list_head_2);
	    } 
	}  