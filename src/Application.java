/**
 * A Class to test a queue by adding and removing customers
 * @author Jake Holovka
 *
 */
public class Application {

	public static void main(String[] args) {
		
		//Creating queue list and initial customers
		Queue list = new Queue();
		GenericNode<String> Cust1 = new GenericNode<String>();
		GenericNode<String> Cust2 = new GenericNode<String>();
		GenericNode<String> Cust3 = new GenericNode<String>();
		
		//setting the customers names
		Cust1.setData("Bill");
		Cust2.setData("Alice");
		Cust3.setData("Bob");
		
		System.out.println("Bill, Alice and Bob are in line, they are entered in the que.");

		list.enqueue(Cust1);
		list.enqueue(Cust2);
		list.enqueue(Cust3);
		
		System.out.println("\nIntial Que\n");
		list.printList();
		
		System.out.println("\nBill is served!\n");
		list.dequeue();
		list.printList();
		
		System.out.println("\nJane arrives!\n");
		GenericNode<String> Cust4 = new GenericNode<String>();
		Cust4.setData("Jane");
		list.enqueue(Cust4);
		list.printList();
		
		System.out.println("\nHamad arrives!\n");
		GenericNode<String> Cust5 = new GenericNode<String>();
		Cust5.setData("Hamad");
		list.enqueue(Cust5);
		list.printList();
		
		System.out.println("\nTwo customers are served!\n");
		list.dequeue();
		list.dequeue();
		list.printList();
		
	
		System.out.println("\nJim arrives!\n");
		GenericNode<String> Cust6 = new GenericNode<String>();
		Cust6.setData("Jim");
		list.enqueue(Cust6);
		list.printList();
		
		System.out.println("\nAnother Customer is Served!\n");
		list.dequeue();
		list.printList();
		
		System.out.println("\nAnother Customer is Served!\n");
		list.dequeue();
		list.printList();
		
	}//end main

}//end class
