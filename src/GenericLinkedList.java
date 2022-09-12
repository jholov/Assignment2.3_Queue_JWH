/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @author Jake Holovka
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericLinkedList<T> {

	private GenericNode<T> head; //node to represent the head of the list
	private GenericNode<T> tail; //node to represent the tail (end) of the list
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * @return
	 */
	public GenericNode <T> getList()
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param aNode
	 */
	@SuppressWarnings("unchecked")
	public void addNode(GenericNode<T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		
		tail.setNextNode(aNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode
	/**
	 * Removes a node by pointing the head to the next node
	 */
	public void removeNode() {
			head=head.getNextNode();
		}//end removeNode
	/**
	 * Prints out all of the nodes in the list until it reaches the end
	 */
	public void printList() {
		 GenericNode<T> currentNode;
		 GenericNode<T> nextNode;
		 currentNode=head;
		
		while(currentNode!=null){
			
			System.out.println(currentNode.getData());
			currentNode=currentNode.getNextNode();
			
		}//end while loop
		
	}//end printList
}//end class

