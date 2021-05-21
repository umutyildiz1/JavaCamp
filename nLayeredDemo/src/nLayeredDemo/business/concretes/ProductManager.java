package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	//link between dataAccess and business layer (in Spring Autowired annotation) //Dependency Injection
	private ProductDao dao;
	private LoggerService loggerService;
	public ProductManager(ProductDao dao,LoggerService loggerService) {
		super();
		this.dao = dao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		this.dao.add(product);
		this.loggerService.logToSystem("Ürün eklendi" + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
