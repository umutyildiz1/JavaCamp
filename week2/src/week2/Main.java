package week2;

public class Main {
//classes are reference type;
	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo",10000,"Details",10);//generating instance
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDiscount(10);
		product2.setDetail("16 GB Ram");
		product2.setUnitPrice(16000);
		
		Product product3 = new Product();
		
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product [] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ev Bahçe");
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
	}

}
