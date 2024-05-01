package ua.oneman.catalogservice.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.oneman.catalogservice.Model.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {
}
