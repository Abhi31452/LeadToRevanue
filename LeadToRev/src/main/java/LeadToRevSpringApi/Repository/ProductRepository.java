package LeadToRevSpringApi.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import LeadToRevSpringApi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


    Optional<Product> findByName(String name);
  
}