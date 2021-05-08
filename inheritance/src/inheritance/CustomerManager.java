package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) { // with polymorphism
		 System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	public void addMultiple(Customer[] customers) { // with polymorphism
		for (Customer customer : customers) {
			System.out.println(customer.customerNumber + " kaydedildi");
		}
	}
}
