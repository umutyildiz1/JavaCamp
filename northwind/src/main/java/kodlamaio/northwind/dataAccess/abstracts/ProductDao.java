package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Category;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	Product getByProductName(String productName);
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	//select * from product where category_id in (1,2,3,4)
	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")//=:öncesi Entity class attributü sonrası parametre ismi
	List<Product> getByNameAndCategory(String productName, int categoryId);
}
