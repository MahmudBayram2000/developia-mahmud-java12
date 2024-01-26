package SpringWeb.OurFirstWebProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	Product findByBarcode(String barcode) ;
	Product findByPrice(String price);


}