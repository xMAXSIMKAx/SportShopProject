package ua.oneman.catalogservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.oneman.catalogservice.Model.Product;
import ua.oneman.catalogservice.Service.ProductService;

import java.util.List;

@RestController("/")
public class ProductController {

    private final ProductService productService

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProduct() {
        return ResponseEntity.ok(productService.getAllProduct());
    } // TODO: add here pageble + filter(check jpa documentation)

    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = productService.getProductById(id);
        if(product == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(product);
    }














}
