package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;//dependency injection
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi" + customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();//dependency
		//logger.log(customer.getFirstName() + "veritabanýna loglandý");
		Utils.runLoggers(loggers,customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi" + customer.getFirstName());
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + "veritabanýna loglandý");
		Utils.runLoggers(loggers,customer.getFirstName());
	}
	
}
