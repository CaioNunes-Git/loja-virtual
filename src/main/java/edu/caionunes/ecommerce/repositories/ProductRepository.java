package edu.caionunes.ecommerce.repositories;

import edu.caionunes.ecommerce.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
