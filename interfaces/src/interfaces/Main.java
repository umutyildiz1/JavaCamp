package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new EmailLogger(),new DatabaseLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer umut = new Customer(1,"umut","yýldýz");
		
		customerManager.add(umut);
	}

}
