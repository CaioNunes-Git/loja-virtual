package edu.caionunes.ecommerce.repositories;

import edu.caionunes.ecommerce.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {
}
