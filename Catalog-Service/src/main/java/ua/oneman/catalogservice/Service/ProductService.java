package ua.oneman.catalogservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.oneman.catalogservice.Model.Product;
import ua.oneman.catalogservice.Model.Repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;


    @Autowired
public ProductService (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.getById(id);
    }




}
