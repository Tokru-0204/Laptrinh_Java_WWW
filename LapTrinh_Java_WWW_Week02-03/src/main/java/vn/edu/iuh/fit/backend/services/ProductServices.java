package vn.edu.iuh.fit.backend.services;

import vn.edu.iuh.fit.backend.enums.ProductStatus;
import vn.edu.iuh.fit.backend.models.Product;
import vn.edu.iuh.fit.backend.repositories.ProductRepository;

import java.util.List;

public class ProductServices {
    private final ProductRepository repository;

    public ProductServices() {
        repository=new ProductRepository();
    }

    public void insert(Product product){
        repository.insert(product);
    }

    public List<Product> getActiveProducts(){
        return repository.getActiveProduct();
    }

    public void updateStatus(long id, ProductStatus status) {
        repository.updateStatus(id,status);
    }
}
