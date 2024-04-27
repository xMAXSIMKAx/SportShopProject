package org.example.app.sportshoponline.service;

import org.example.app.sportshoponline.model.Product;

import java.util.List;

public class CatalogService {
    private DbService dbService;

    public CatalogService(DbService dbService) {
        this.dbService = dbService;
    }

    public void saveProduct(Product product) {
        dbService.save(product);
    }

    public void updateProduct(Product product) {
        dbService.update(product);
    }

    public void deleteProduct(int productId) {
        dbService.delete(Product.class, productId);
    }

    public List<Product> searchProducts(String keyword) {
        return (List<Product>) dbService.search(Product.class, keyword);
    }
}
