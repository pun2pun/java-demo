package org.pun2pun.inventory_management_service.service;

import org.pun2pun.inventory_management_service.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Optional<Product> findOneById(Long productId);

    Product addProduct(Product product);

    void removeProduct(Long id);
}
