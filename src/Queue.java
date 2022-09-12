/**
 * A class to add and remove customers into a queue 
 * @author Jake Holovka
 *
 */
public class Queue {

	GenericLinkedList<String> b = new GenericLinkedList<String>();
	/**
	 * Adds a customer into the queue at the back of the line
	 * @param newEntry
	 */
	public void enqueue(GenericNode<String> newEntry) {
		
	b.addNode(newEntry);
	
	}//end enqueue
	/**
	 * Removes the top customers from the queue and returns the customer removed
	 * @return Object
	 */
	public  Object dequeue () {
	
	GenericNode temp = new GenericNode();
	
	temp= b.getList();
	b.removeNode();
	return temp.getData();
	
	}//end dequeue
	/**
	 * Lists the head of the queue
	 * @return GenericNode
	 */
	public GenericNode<String> getList()
	{
		return  b.getList();
		
	}//end getList
	/**
	 * Prints out all customers in the queue
	 */
	public void printList() {
		b.printList();
		
	}//end printList
	
}//end class
