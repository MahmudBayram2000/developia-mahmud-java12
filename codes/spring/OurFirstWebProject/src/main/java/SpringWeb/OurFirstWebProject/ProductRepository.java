package SpringWeb.OurFirstWebProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	void findByBarcode(String barcode);
	

}
