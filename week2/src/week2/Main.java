package week2;

public class Main {
//classes are reference type;
	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo",10000,"Details");//generating instance
		
		Product product2 = new Product();
		product2.id = 2;
		product2.name = "HP";
		product2.unitPrice = 10000;
		
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Asus";
		product3.unitPrice = 10000;
		
		Product [] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
	}

}
