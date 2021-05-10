package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new DatabaseLogger(), new FileLogger()};
		
		Customer customer = new Customer(1, "Tamer", "Murtazaoglu");
		
		CustomerManager customerManager = new CustomerManager(loggers);
		customerManager.add(customer);	
	}
}
