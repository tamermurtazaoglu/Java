package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer tamer = new IndividualCustomer();
		tamer.customerNumber = "123456";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "654321";
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(tamer);
		customerManager.add(hepsiBurada);
		
		// or 
		
		Customer[] customers = { tamer, hepsiBurada };
		customerManager.addMultiple(customers);
	
	}

}
