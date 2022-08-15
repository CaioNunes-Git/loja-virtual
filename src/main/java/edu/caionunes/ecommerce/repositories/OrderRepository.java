package edu.caionunes.ecommerce.repositories;

import edu.caionunes.ecommerce.entites.Order;
import edu.caionunes.ecommerce.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
