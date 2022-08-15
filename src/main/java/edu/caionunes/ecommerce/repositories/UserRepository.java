package edu.caionunes.ecommerce.repositories;

import edu.caionunes.ecommerce.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
