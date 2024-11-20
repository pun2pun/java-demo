package org.pun2pun.inventory_management_service.service;

import org.pun2pun.inventory_management_service.model.Product;
import org.pun2pun.inventory_management_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findOneById(Long productId){
        return  repository.findById(productId);
    }

    @Override
    public Product addProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void removeProduct(Long id) {
         repository.deleteById(id);
    }
}
