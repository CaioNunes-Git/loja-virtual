package edu.caionunes.ecommerce.repositories;

import edu.caionunes.ecommerce.entites.OrderItem;
import edu.caionunes.ecommerce.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
