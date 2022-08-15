package edu.caionunes.ecommerce.services;

import edu.caionunes.ecommerce.entites.Category;
import edu.caionunes.ecommerce.entites.Order;
import edu.caionunes.ecommerce.repositories.CategoryRepository;
import edu.caionunes.ecommerce.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
