package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer umut = new IndividualCustomer();
		umut.customerNum = "12345";
		
		CorporateCustomer trendyol = new CorporateCustomer();
		trendyol.customerNum = "98765";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNum = "44444";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(trendyol);
		//customerManager.add(umut);
		//customerManager.add(sendikaCustomer);
		Customer[] customers = {umut,trendyol,sendikaCustomer};
		customerManager.addMultiple(customers);

	}

}
