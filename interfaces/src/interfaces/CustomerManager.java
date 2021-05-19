package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;//dependency injection
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi" + customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();//dependency
		//logger.log(customer.getFirstName() + "veritaban�na logland�");
		Utils.runLoggers(loggers,customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi" + customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + "veritaban�na logland�");
		Utils.runLoggers(loggers,customer.getFirstName());
	}
	
}
